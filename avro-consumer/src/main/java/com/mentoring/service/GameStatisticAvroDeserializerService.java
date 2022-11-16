package com.mentoring.service;

import com.mentoring.GameStatisticAvro;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Slf4j
@Service
public class GameStatisticAvroDeserializerService implements Deserializer<GameStatisticAvro> {

    public <T extends SpecificRecordBase> String serializeToJSON(T request, Class<T> clazz) {
        DatumWriter<T> writer = new SpecificDatumWriter<>(clazz);
        byte[] data = new byte[0];
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder jsonEncoder = null;
        try {
            jsonEncoder = EncoderFactory.get()
                    .jsonEncoder(request.getSchema(), stream);
            writer.write(request, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
        } catch (IOException e) {
            log.error("Serialization error " + e.getMessage());
        }
        return new String(data);
    }

    public <T extends SpecificRecordBase> byte[] serializeToBinary(T request, Class<T> clazz) {
        DatumWriter<T> writer = new SpecificDatumWriter<>(clazz);
        byte[] data = new byte[0];
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder jsonEncoder = EncoderFactory.get()
                .binaryEncoder(stream, null);
        try {
            writer.write(request, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
        } catch (IOException e) {
            log.error("Serialization error " + e.getMessage());
        }
        return data;
    }

    @Override
    public GameStatisticAvro deserialize(String s, byte[] bytes) {
        GameStatisticAvro gameStatisticAvro = null;
        DatumReader<GameStatisticAvro> employeeReader = new SpecificDatumReader<>(GameStatisticAvro.class);
        Decoder decoder = DecoderFactory.get().binaryDecoder(bytes, null);
        try {
            gameStatisticAvro = employeeReader.read(null, decoder);
        } catch (IOException e) {
            log.error("Deserialization error" + e.getMessage());
        }
        return gameStatisticAvro;
    }
}

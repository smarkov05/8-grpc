package com.mentoring.service;

import com.mentoring.GameStatisticAvro;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Slf4j
@Service
public class GameStatisticAvroSerializeService implements Serializer<GameStatisticAvro> {

    @Override
    public byte[] serialize(String s, GameStatisticAvro gameStatisticAvro) {
        DatumWriter<GameStatisticAvro> writer = new SpecificDatumWriter<>(GameStatisticAvro.class);
        byte[] data = new byte[0];
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Encoder jsonEncoder = EncoderFactory.get()
                .binaryEncoder(stream, null);
        try {
            writer.write(gameStatisticAvro, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
        } catch (IOException e) {
            log.error("Avro serialization error " + e.getMessage(), e);
        }
        return data;
    }
}

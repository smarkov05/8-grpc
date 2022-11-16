package com.mentoring.service;

import com.mentoring.GameStatisticAvro;
import com.mentoring.config.KafkaTopicConfig;
import com.mentoring.dto.GameStatisticDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameStatisticProducerServiceImpl implements GameStatisticProducerService {
    private final KafkaTemplate<String, GameStatisticAvro> template;

    @Override
    public void sendGameStatistic(GameStatisticDto gameStatisticDto) {

        template.send(KafkaTopicConfig.GAME_STATISTIC_TOPIC, gameStatisticDto.toGameStatisticAvro());
    }
}


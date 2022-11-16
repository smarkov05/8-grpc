package com.mentoring.service;

import com.mentoring.GameStatisticAvro;
import com.mentoring.config.KafkaGameStatisticConsumerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GameStatisticConsumerService {

    @KafkaListener(
            groupId = KafkaGameStatisticConsumerConfig.GAME_STATISTIC_CONSUMER_GROUP_ID,
            topics = KafkaGameStatisticConsumerConfig.GAME_STATISTIC_TOPIC)
    public void consumeGameStatistic(@Payload List<GameStatisticAvro> gameStatistics) {
        gameStatistics.stream()
                .map(GameStatisticAvro::toString)
                .forEach(log::warn);
    }
}

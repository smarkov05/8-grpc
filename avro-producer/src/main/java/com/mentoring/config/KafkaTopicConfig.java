package com.mentoring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private static final Integer DEFAULT_REPLICAS_QUANTITY = 1;
    private static final Integer DEFAULT_PARTITION_QUANTITY = 2;
    public static final String GAME_STATISTIC_TOPIC = "game.statistic.topic";

    @Bean
    public NewTopic createGameStatisticTopic() {
        return TopicBuilder
                .name(GAME_STATISTIC_TOPIC)
                .replicas(DEFAULT_REPLICAS_QUANTITY)
                .partitions(DEFAULT_PARTITION_QUANTITY)
                .build();
    }

}

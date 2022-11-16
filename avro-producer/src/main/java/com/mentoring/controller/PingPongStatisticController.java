package com.mentoring.controller;

import com.mentoring.dto.GameStatisticDto;
import com.mentoring.service.GameStatisticProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ping-pong/statistic")
@RequiredArgsConstructor
public class PingPongStatisticController {
    private final GameStatisticProducerService gameStatisticProducerService;

    @PostMapping
    public void createGameStatistic(@RequestBody GameStatisticDto gameStatistic) {
        gameStatisticProducerService.sendGameStatistic(gameStatistic);
    }
}

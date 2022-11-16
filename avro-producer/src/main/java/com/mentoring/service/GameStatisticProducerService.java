package com.mentoring.service;

import com.mentoring.dto.GameStatisticDto;

public interface GameStatisticProducerService {
    void sendGameStatistic(GameStatisticDto gameStatisticDto);
}

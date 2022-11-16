package com.mentoring.dto;

import com.mentoring.GameStatisticAvro;
import com.mentoring.GameStatusAvro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
public class GameStatisticDto implements Serializable {
    private LocalDate gameDate;
    private String score;
    private List<PlayerDto> players;
    private GamesStatus gameStatus;

    public GameStatisticAvro toGameStatisticAvro() {
        return GameStatisticAvro.newBuilder()
                .setGameDate(org.joda.time.LocalDate.parse(this.gameDate.toString()))
                .setScore(this.score)
                .setPlayers(
                        this.players.stream()
                                .map(PlayerDto::toPlayerAvro)
                                .toList())
                .setGameStatus(GameStatusAvro.valueOf(this.gameStatus.name()))
                .build();
    }
}

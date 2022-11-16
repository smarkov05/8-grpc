package com.mentoring.dto;

import com.mentoring.PlayerAvro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PlayerDto implements Serializable {
    private String fullName;
    private boolean disqualified;
    private long rank;

    public PlayerAvro toPlayerAvro() {
        return PlayerAvro.newBuilder()
                .setFullName(this.fullName)
                .setDisqualified(this.disqualified)
                .setRank(this.rank)
                .build();
    }
}

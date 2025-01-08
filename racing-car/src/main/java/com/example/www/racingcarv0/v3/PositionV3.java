package com.example.www.racingcarv0.v3;

import lombok.Getter;

public class PositionV3 {

    @Getter
    private int position;

    public PositionV3() {
        this(0);
    }

    public PositionV3(int position) {
        this.position = position;
    }
}

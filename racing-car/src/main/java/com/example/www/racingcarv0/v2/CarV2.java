package com.example.www.racingcarv0.v2;

import lombok.Getter;

public class CarV2 {
    @Getter
    private int position;

    public void move(MovingStrategyV2 movingStrategy) {
        if (movingStrategy.moveable()) {
            this.position++;
        }
    }
}

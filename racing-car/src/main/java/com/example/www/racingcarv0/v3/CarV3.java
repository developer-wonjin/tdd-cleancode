package com.example.www.racingcarv0.v3;

import com.example.www.racingcarv0.v2.MovingStrategyV2;
import lombok.Getter;

import java.util.Random;

public class CarV3 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;

    @Getter
    private int position;

    public void move(MovingStrategyV2 movingStrategy) {
        if (movingStrategy.moveable()) {
            this.position++;
        }
    }
}

package com.example.www.racingcarv0.v5;

import com.example.www.racingcarv0.v2.MovingStrategyV2;

import java.util.Random;

public class RandomMovingStrategyV5 implements MovingStrategyV5 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;

    @Override
    public boolean moveable() {
        return getRandomNumber() >= FOWARD_NUM;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}

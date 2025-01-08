package com.example.www.racingcarv0.v6;

import java.util.Random;

public class RandomMovingStrategyV6 implements MovingStrategyV6 {
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

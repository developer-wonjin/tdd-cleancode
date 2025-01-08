package com.example.www.racingcarv0.v4;

import com.example.www.racingcarv0.v2.MovingStrategyV2;
import lombok.Getter;

import java.util.Random;

public class CarV4 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;

    private PositionV4 position;

    public void move(MovingStrategyV2 movingStrategy) {
        if (movingStrategy.moveable()) {
            position.increase();
        }
    }

    public void move(int randomNumber) {
        if (randomNumber >= FOWARD_NUM) {
            position.increase();
        }
    }

    public void move() {
        if (getRandomNumber() >= FOWARD_NUM) {
            position.increase();
        }
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}

package com.example.www.racingcarv0.v5;

import java.util.Random;

public class CarV5 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;

    private PositionV5 position;

    public CarV5() {
        this(new PositionV5());
    }

    public CarV5(PositionV5 position) {
        this.position = position;
    }

    public void move(MovingStrategyV5 movingStrategy) {
        if (movingStrategy.moveable()) {
            position = position.increase();
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

    public void printStatus() {
        System.out.print(position.printStatus());
    }
}

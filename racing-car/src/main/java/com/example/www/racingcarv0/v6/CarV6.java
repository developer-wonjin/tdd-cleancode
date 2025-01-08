package com.example.www.racingcarv0.v6;

import java.util.Random;

public class CarV6 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;
    private String driverName;
    private PositionV6 position;

    public CarV6() {
        this(new PositionV6());
    }

    public CarV6(PositionV6 position) {
        this.position = position;
    }

    public CarV6(String driverName) {
        this.driverName = driverName;
        this.position = new PositionV6();
    }

    public void move(MovingStrategyV6 movingStrategy) {
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

    public int getPosition() {
        return position.getPosition();
    }

    public boolean isWinner(int maxPosition) {
        return position.isSame(maxPosition);
    }

    public String getName() {
        return driverName;
    }

}

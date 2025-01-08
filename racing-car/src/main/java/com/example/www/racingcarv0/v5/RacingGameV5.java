package com.example.www.racingcarv0.v5;

import lombok.Getter;


public class RacingGameV5 {

    @Getter
    private final CarsV5 cars;
    private int remainChance;

    public RacingGameV5(int remainChance, CarsV5 cars) {
        this.remainChance = remainChance;
        this.cars = cars;
    }

    public boolean isEnd() {
        return remainChance == 0;
    }

    public boolean raceAble() {
        return remainChance > 0;
    }

    public void race() {
        this.remainChance--;
        cars.move();

//        for (CarV5 car : cars) {
//            car.move(new RandomMovingStrategyV2());
//        }

//        for (CarV5 car : cars) {
//            car.move(4);
//        }

//        for (CarV5 car : cars) {
//            car.move();
//        }

    }
}

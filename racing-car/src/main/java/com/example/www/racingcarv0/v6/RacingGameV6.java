package com.example.www.racingcarv0.v6;

import lombok.Getter;


public class RacingGameV6 {

    @Getter
    private final CarsV6 cars;
    private int remainChance;

    public RacingGameV6(int remainChance, CarsV6 cars) {
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

//        for (CarV6 car : cars) {
//            car.move(new RandomMovingStrategyV2());
//        }

//        for (CarV6 car : cars) {
//            car.move(4);
//        }

//        for (CarV6 car : cars) {
//            car.move();
//        }

    }
}

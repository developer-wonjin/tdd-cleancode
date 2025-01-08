package com.example.www.racingcarv0.v2;

import java.util.List;

public class RacingGameV2 {

    private int remainChance;
    private List<CarV2> cars;

    public RacingGameV2(int remainChance, List<CarV2> cars) {
        this.remainChance = remainChance;
        this.cars = cars;
    }

    public void race() {
        this.remainChance--;

        for (CarV2 car : cars) {
            car.move(new RandomMovingStrategyV2());
        }

//        for (CarV2 car : cars) {
//            car.move(4);
//        }

//        for (CarV2 car : cars) {
//            car.move();
//        }

    }
}

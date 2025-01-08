package com.example.www.racingcarv0.v3;

import com.example.www.racingcarv0.v2.RandomMovingStrategyV2;

import java.util.List;

public class RacingGameV3 {

    private int remainChance;
    private List<CarV3> cars;

    public RacingGameV3(int remainChance, List<CarV3> cars) {
        this.remainChance = remainChance;
        this.cars = cars;
    }

    public void race() {
        this.remainChance--;

        for (CarV3 car : cars) {
            car.move(new RandomMovingStrategyV2());
        }

//        for (CarV3 car : cars) {
//            car.move(4);
//        }

//        for (CarV3 car : cars) {
//            car.move();
//        }

    }
}

package com.example.www.racingcarv0.v4;

import com.example.www.racingcarv0.v2.RandomMovingStrategyV2;

import java.util.List;

public class RacingGameV4 {

    private int remainChance;
    private List<CarV4> cars;

    public RacingGameV4(int remainChance, List<CarV4> cars) {
        this.remainChance = remainChance;
        this.cars = cars;
    }

    public void race() {
        this.remainChance--;

        for (CarV4 car : cars) {
            car.move(new RandomMovingStrategyV2());
        }

//        for (CarV4 car : cars) {
//            car.move(4);
//        }

//        for (CarV4 car : cars) {
//            car.move();
//        }

    }
}

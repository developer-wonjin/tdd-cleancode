package com.example.www.racingcarv0.v5;

import java.util.ArrayList;
import java.util.List;

public class CarsV5 {
    private final List<CarV5> cars;

    public CarsV5(List<CarV5> cars) {
        this.cars = cars;
    }

    public CarsV5(int numOfCars) {
        this(createCars(numOfCars));
    }

    private static List<CarV5> createCars(int numOfCars) {
        ArrayList<CarV5> carList = new ArrayList<>();
        while (numOfCars-- > 0) {
            carList.add(new CarV5());
        }
        return carList;
    }

    public void move() {
        for (CarV5 car : cars) {
            car.move(new RandomMovingStrategyV5());
        }
    }

    public void printStatus() {
        cars.forEach(carV5 -> {
            carV5.printStatus();
            System.out.println();
        });
        System.out.println("=============================");
    }
}

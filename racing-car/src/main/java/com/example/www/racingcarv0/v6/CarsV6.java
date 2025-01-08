package com.example.www.racingcarv0.v6;

import java.util.ArrayList;
import java.util.List;

public class CarsV6 {
    private final List<CarV6> cars;

    public CarsV6(List<CarV6> cars) {
        this.cars = cars;
    }

    public CarsV6(int numOfCars) {
        this(createCars(numOfCars));
    }

    public CarsV6(String participants) {
        this(createCars(participants));
    }

    private static List<CarV6> createCars(String inputText) {
        String[] participants = inputText.split(",");
        List<CarV6> carList = new ArrayList<>();
        for (String participant : participants) {
            carList.add(new CarV6(participant));
        }
        return carList;
    }

    private static List<CarV6> createCars(int numOfCars) {
        ArrayList<CarV6> carList = new ArrayList<>();
        while (numOfCars-- > 0) {
            carList.add(new CarV6());
        }
        return carList;
    }

    public void move() {
        for (CarV6 car : cars) {
            car.move(new RandomMovingStrategyV6());
        }
    }

    public void printStatus() {
        cars.forEach(CarV6 -> {
            CarV6.printStatus();
            System.out.println();
        });
        System.out.println("=============================");
    }

    public String getWinners() {
        int maxPosition = -1;
        for (CarV6 car : cars) {
            if (car.getPosition() > maxPosition) maxPosition = car.getPosition();
        }

        List<String> winners = new ArrayList<>();
        for (CarV6 car : cars) {
            if (car.isWinner(maxPosition)) winners.add(car.getName());
        }
        return String.join(",", winners);
    }
}

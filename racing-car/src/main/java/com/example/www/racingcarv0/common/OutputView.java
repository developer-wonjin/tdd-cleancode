package com.example.www.racingcarv0.common;

import com.example.www.racingcarv0.v6.CarsV6;

public class OutputView {

    public static void printStatus(CarsV6 cars) {
        System.out.println("실행 결과");
        cars.printStatus();
    }

    public static void printWinners(CarsV6 cars) {

        System.out.println(cars.getWinners() + "가 최종 우승했습니다.");
    }
}

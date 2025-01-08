package com.example.www.racingcarv0;

import com.example.www.racingcarv0.common.InputView;
import com.example.www.racingcarv0.common.OutputView;
import com.example.www.racingcarv0.v6.CarsV6;
import com.example.www.racingcarv0.v6.RacingGameV6;

public class RacingMain {

    public static void main(String[] args) {
        String participants = InputView.getParticipants();
        int numOpp = InputView.getNumOpp();

//        ArrayList<CarV5> carList = new ArrayList<>();
//        while(numOfCars-- > 0) {
//            carList.add(new CarV5());
//        }

        CarsV6 cars = new CarsV6(participants);
        RacingGameV6 racingGame = new RacingGameV6(numOpp, cars);

        // 절차지향적 코드
//        for (int i = 0; i < numOfOpp; i++) {
//            racingGame.race();
//        }

        // 객체지향적 코드
        //while (!racingGame.isEnd()) {
        while (racingGame.raceAble()) {
            // 비즈니스로직
            racingGame.race();

            // 화면
            OutputView.printStatus(racingGame.getCars());
        }
        OutputView.printWinners(racingGame.getCars());
    }
}

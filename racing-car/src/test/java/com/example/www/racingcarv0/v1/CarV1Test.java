package com.example.www.racingcarv0.v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarV1Test {
    @Test
    void 전진 () {
        CarV1 car = new CarV1();
        car.move(4);// 테스트는 되도록 경계값을 사용하자
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지 () {
        CarV1 car = new CarV1();
        car.move(1);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 전진_재정의이용 () {
        CarV1 car = new CarV1() {
            @Override
            protected int getRandomNumber() {
                return 4;
            }
        };
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
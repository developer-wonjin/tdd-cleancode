package com.example.www.racingcarv0.v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarV2Test {

    @Test
    void 전진_람다식 () {
        CarV2 car = new CarV2();
        car.move(() -> true);// 테스트는 되도록 경계값을 사용하자
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지_람다식 () {
        CarV2 car = new CarV2();
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 전진 () {
        CarV2 car = new CarV2();
        car.move(new MovingStrategyV2() {
            @Override
            public boolean moveable() {
                return true;
            }
        });// 테스트는 되도록 경계값을 사용하자
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지 () {
        CarV2 car = new CarV2();
        car.move(new MovingStrategyV2() {
            @Override
            public boolean moveable() {
                return false;
            }
        });
        assertThat(car.getPosition()).isEqualTo(0);
    }


}
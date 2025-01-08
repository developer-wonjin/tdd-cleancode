package com.example.www.racingcarv0.v0;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// 항상 통과하지 못하는 테스트
public class CarV0Tests {


    @Test
    void 전진() {
        CarV0 car = new CarV0();
        car.move();
        // getter싫은데 어쩔 수가 없네;;
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지() {
        CarV0 car = new CarV0();
        car.move();
        // getter싫은데 어쩔 수가 없네;;
        assertThat(car.getPosition()).isEqualTo(0);
    }
}

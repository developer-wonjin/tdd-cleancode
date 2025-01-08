package com.example.www.racingcarv0.v4;

import org.assertj.core.api.SoftThrowableTypeAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PositionV5Test {

    @Test
    void move() {
        PositionV4 position = new PositionV4();
        position.increase();
        assertThat(position).isEqualTo(new PositionV4(1));
    }

    @Test
    void valid() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new PositionV4(-1))
                .withMessage("position must be greater than or equal to 0");
    }

    @Test
    void createPosition() {
        // equals를 재정의하지 않았기 때문에 주소비교를 진행함
        assertThat(new PositionV4()).isEqualTo(new PositionV4());
    }

}
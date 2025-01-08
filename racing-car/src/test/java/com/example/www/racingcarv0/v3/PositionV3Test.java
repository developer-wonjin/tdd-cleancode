package com.example.www.racingcarv0.v3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionV3Test {
    @Test
    void createPosition2 () {
        // equals를 재정의하지 않았기 때문에 주소비교를 진행함
        assertThat(new PositionV3()).isEqualTo(new PositionV3());
    }

    @Test
    void createPosition1 () {
        PositionV3 position = new PositionV3();
        assertThat(position.getPosition()).isEqualTo(0);
    }

}
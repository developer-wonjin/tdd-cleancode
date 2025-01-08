package com.example.www.racingcarv0.v4;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(of = {"position"})
public class PositionV4 {

    private final int position;

    public PositionV4() {
        this(0);
    }

    public PositionV4(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position must be greater than or equal to 0");
        }
        this.position = position;
    }

    //CQRS의 반대성향
    public PositionV4 increase() {
//        this.position++;
//        return this;
        return new PositionV4(position + 1);//객체가 늘어난다고 성능이 크게 나빠지진 앟는다
    }

    //CQRS로 분리
    public void increase0() {
        //this.position++;
    }

    //CQRS로 분리
    public int getPosition() {
        return position;
    }
}

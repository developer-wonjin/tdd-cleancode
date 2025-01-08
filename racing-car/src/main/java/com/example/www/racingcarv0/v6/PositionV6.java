package com.example.www.racingcarv0.v6;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(of = {"position"})
public class PositionV6 {

    private final int position;

    public PositionV6() {
        this(0);
    }

    public PositionV6(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position must be greater than or equal to 0");
        }
        this.position = position;
    }

    //CQRS의 반대성향
    public PositionV6 increase() {
//        this.position++;
//        return this;
        return new PositionV6(position + 1);//객체가 늘어난다고 성능이 크게 나빠지진 앟는다
    }

    //CQRS로 분리
    public void increase0() {
        //this.position++;
    }

    //CQRS로 분리
    public int getPosition() {
        return position;
    }

    public String printStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(Math.max(0, position)));
        return sb.toString();
    }

    public boolean isSame(int otherPosition) {
        return otherPosition == position;
    }

}

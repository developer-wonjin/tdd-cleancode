package com.example.www.racingcarv0.v1;

import java.util.Random;

public class CarV1 {
    public static final int FOWARD_NUM = 4;
    public static final int MAX_BOUND = 10;
    private int position;

    /*
    방법1
    : 메소드시그니처를 변경하여 랜덤값을 파라미터로 전달받는 메소드*/
    public void move(int randomNumber) {
        if (randomNumber >= FOWARD_NUM) {
            this.position++;
        }
    }

    public void move() {

        if (getRandomNumber() >= FOWARD_NUM) {
            this.position++;
        }
    }

    /*
    방법2
    : 접근제어자를 protected로 변경하여 테스트에서 재정의할 수 있도록 유연함을 준다.
    기존의 move메소드의 시그니처를 변경할 수 없을 때 유용
    기존의 move메소드의 시그니처를 변경없이 안정감을 갖고 테스트할 수 있음
    과도기적인 단계에서 쓸 수 있는 좋은 방법*/
    protected int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    public int getPosition() {
        return position;
    }
}

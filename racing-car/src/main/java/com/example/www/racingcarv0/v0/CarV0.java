package com.example.www.racingcarv0.v0;

import java.util.Random;

public class CarV0 {
    private int position;

    public void move() {
        Random random = new Random();
        int rd = random.nextInt(10);
        if (rd >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}

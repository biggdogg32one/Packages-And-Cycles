package ru.netology.sqr;

public class SQRServices {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;
                }

            }
        }
        return counter;
    }
}

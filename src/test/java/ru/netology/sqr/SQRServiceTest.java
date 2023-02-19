package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {
    @Test
    public void calcTest1() {
        SQRServices service = new SQRServices();

        int actual = service.calc(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTest2() {
        SQRServices service = new SQRServices();

        int actual = service.calc(7, 98);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTest3() {
        SQRServices service = new SQRServices();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void calcTest4() {
        SQRServices service = new SQRServices();

        int actual = service.calc(100, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcTest5() {
        SQRServices service = new SQRServices();

        int actual = service.calc(300, 5000);
        int expected = 53;

        Assertions.assertEquals(expected, actual);

    }

}


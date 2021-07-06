package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void getArea1() {
        Square test = new Square(2.0);
        double actual = test.getArea();
        double expected = 4.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getArea2() {
        Square test = new Square(2.0);
        test.setRadius(-5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

}
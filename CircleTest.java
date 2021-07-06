package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getArea1() {
        Circle test = new Circle(2.0);
        double actual = test.getArea();
        double expected = 12.56;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getArea2() {
        Circle test = new Circle(2.0);
        test.setRadius(-5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }
}
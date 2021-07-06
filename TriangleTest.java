package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getArea1() {
        Triangle test = new Triangle(2.0, 2.0);
        double actual = test.getArea();
        double expected = 2.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getArea2() {
        Triangle test = new Triangle(2.0, 2.0);
        test.setHeight(-5.2);
        test.setBase(-5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }
}
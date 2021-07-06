package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EllipseTest {

    @Test
    public void getArea1() {
        Ellipse test = new Ellipse(2.0, 2.0);
        double actual = test.getArea();
        double expected = 12.56;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getArea2() {
        Ellipse test = new Ellipse(2.0, 2.0);
        test.setA(-5.2);
        test.setB(-5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getArea3() {
        Ellipse test = new Ellipse(2.0, 2.0);
        test.setA(-5.2);
        test.setB(5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getArea4() {
        Ellipse test = new Ellipse(2.0, 2.0);
        test.setA(5.2);
        test.setB(-5.2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }
}
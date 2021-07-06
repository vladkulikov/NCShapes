package com.company;
/*треугольник*/
public class Triangle implements IShape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getName(){
        return "triangle";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public boolean getSignBase() {
        if (base > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getSignHeight() {
        if (height > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getArea() {
        if (getSignBase() || getSignHeight()) {
            return (height * base) / 2;
        } else {
            return -1.0;
        }
    }
}

package com.company;
/*эллипс'*/
public class Ellipse implements IShape{
    private double a, b;

    public Ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }

    public String getName(){
        return "ellipse";
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean getSignA() {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getSignB() {
        if (b > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getArea() {
        if (getSignA() || getSignB()) {
            return (a * b) * Math.PI;
        } else {
            return -1.0;
        }
    }
}

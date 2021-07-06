package com.company;
/*круг*/
public class Circle implements IShape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getSignRadius(){
        if (radius > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double getArea() {
        if (getSignRadius()) {
            return (Math.pow(radius, 2) * Math.PI);
        } else {
            return -1.0;
        }
    }
}

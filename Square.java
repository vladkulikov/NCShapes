package com.company;
/*квадрат*/
public class Square implements IShape{
    private double a;
    public Square(double radius){
        this.a = radius;
    }

    public String getName(){
        return "square";
    }

    public double getRadius() {
        return a;
    }

    public void setRadius(double radius) {
        this.a = radius;
    }

    public boolean getSignRadius(){
        if (a > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double getArea(){
        if(getSignRadius()){
            return (Math.pow(a, 2));
        }
        else{
            return -1.0;
        }

    }
}


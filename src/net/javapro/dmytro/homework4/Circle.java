package net.javapro.dmytro.homework4;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public double getArea() {
        double circleAre = (Math.PI * (radius * radius));
        return  circleAre;


    }
}

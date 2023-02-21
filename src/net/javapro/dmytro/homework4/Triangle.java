package net.javapro.dmytro.homework4;

public class Triangle implements Shape{
    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public double getArea() {
        double triangleArea = ((length * height) * 0.5);
        return  triangleArea;

    }
}

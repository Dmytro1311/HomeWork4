package net.javapro.dmytro.homework4;

public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    @Override
    public double getArea() {
        double squareArea = (length * length);
        return  squareArea;
    }
}

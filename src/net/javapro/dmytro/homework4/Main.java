package net.javapro.dmytro.homework4;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Circle(6);
        shape[1] = new Triangle(2,6);
        shape[2] = new Square(5);


        double areaSum = 0;

        for (int i = 0; i < shape.length; i++){
            System.out.println(shape[i].getArea());
            areaSum += shape[i].getArea();
            }
        System.out.println();
        System.out.println("Сумарна площа всіх фігур " + areaSum);


        }


    }



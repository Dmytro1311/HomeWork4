package net.dmytro.homework4;

public class Main {
    public static void main(String[] args) {
       Cat cat =  new Cat();
       cat.ran(200);
       cat.swim(0);
        System.out.println();
       Dog dog = new Dog();
       dog.ran(500);
       dog.swim(10);
    }
}
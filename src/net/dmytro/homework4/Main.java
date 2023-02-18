package net.dmytro.homework4;

public class Main {
    public static void main(String[] args) {
       Cat cat =  new Cat("Pit");
       cat.ran(200);
       cat.swim(0);
       Cat cat1 = new Cat("Kity");
       cat1.swim(5);
       cat1.ran(150);
        System.out.println();
       Dog dog = new Dog("Bobik");
       dog.ran(500);
       dog.swim(10);

       Dog dog1 = new Dog("Funtik");
        dog1.ran(400);
        dog1.swim(0);

        System.out.println("Numbers of dogs " + dog.getCount() + "\n" + "Numbers of cats " + cat.getCount() + "\n" + "Numbers of Animals " + (cat.getCount() + dog.getCount() - 2));






    }
}
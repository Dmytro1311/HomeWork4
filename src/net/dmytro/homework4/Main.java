package net.dmytro.homework4;

public class Main {
    public static void main(String[] args) {

        Cat cat =  new Cat("Pit");
       cat.ran(200,100 );
       cat.swim(0, 0);
       Cat cat1 = new Cat("Kity");
       cat1.swim(5, 0);
       cat1.ran(150,100 );
        System.out.println();
       Dog dog = new Dog("Bobik");
       dog.ran(500, 400);
       dog.swim(10,7 );

       Dog dog1 = new Dog("Funtik");
        dog1.ran(400,350 );
        dog1.swim(10,8 );

        System.out.println("Numbers of dogs " + dog.getCount() + "\n" + "Numbers of cats " + cat.getCount() + "\n" + "Numbers of Animals " + Animal.getCount());






    }
}
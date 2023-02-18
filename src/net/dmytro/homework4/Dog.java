package net.dmytro.homework4;

public class Dog extends Animal {
private String dogName;
private static int count = 0;

    public Dog(String dogName ) {
        this.dogName = dogName;

    }

    @Override
    void ran(int maxRan) {
        if (maxRan >= 0)  {
            System.out.println("Dog " + dogName + " run " + maxRan + " м");

        }
        count++;
    }

    @Override
    void swim(int maxSwim) {
        if (maxSwim >= 0)  {
            System.out.println("Dog " + dogName + " swam " + maxSwim + " м");
        }else {
            System.out.println("Dog can't swim ");
        }

    }
    public int getCount(){
        return count;
    }

}

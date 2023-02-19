package net.dmytro.homework4;

public class Cat extends Animal {
private String name;
private static int count;

    public Cat(String name) {
        this.name=name;
        count++;


    }


    @Override
    void ran(int maxRanDistance, int distanceToDo) {
        if (maxRanDistance >= distanceToDo && distanceToDo >0 ) {
            System.out.println("Cat " + name +" run " + distanceToDo + " м");
        }

        }


    @Override
    void swim(int maxSwimDistance, int distanceToDo) {
        if (maxSwimDistance >= distanceToDo && distanceToDo > 0) {
            System.out.println("Cat " + name + " swam " + maxSwimDistance + " м");

        } else {
            System.out.println("Cat can't swim ");
        }
    }
    public static int getCount(){
        return count;
    }

}

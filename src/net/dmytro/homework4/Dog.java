package net.dmytro.homework4;

public class Dog extends Animal {
    private String name;
    private static int count;


    public Dog(String name) {
        this.name=name;
        count++;

    }


    @Override
    void ran(int maxRanDistance, int distanceToDo) {
        if (maxRanDistance >= distanceToDo && distanceToDo > 0 )  {
            System.out.println("Dog " + name + " run " + distanceToDo + " м");
        }

    }

    @Override
    void swim(int maxSwimDistance, int distanceToDo) {
        if (maxSwimDistance >= distanceToDo && distanceToDo >= 0)  {
            System.out.println("Dog " + name + " swam " + distanceToDo + " м");
        }else {
            System.out.println("Dog can't swim ");
        }

    }
    public static int getCount(){
        return count;
    }

}

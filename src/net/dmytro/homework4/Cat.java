package net.dmytro.homework4;

public class Cat extends Animal {
private String catName;
private static int count = 0;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    void ran(int maxRan) {
        if (maxRan >= 0 ) {
            System.out.println("Cat " + catName +" run " + maxRan + " м");
        }
        count++;
        }


    @Override
    void swim(int maxSwim) {
        if (maxSwim == 0) {
            System.out.println("Cat can't swim ");
        } else {
            System.out.println("Cat " + catName + " swam " + maxSwim + " м");
        }
    }
    public int getCount(){
        return count;
    }

}

package net.dmytro.homework4;

public class Dog extends Animal {


    @Override
    void ran(int runLength) {
        if (runLength >= 0)  {
            System.out.println("Пес пробіг " + runLength + " м");
        }
    }

    @Override
    void swim(int swimLength) {
        if (swimLength >= 0)  {
            System.out.println("Пес проплив " + swimLength + " м");
        }
    }
}

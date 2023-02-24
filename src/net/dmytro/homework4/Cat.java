package net.dmytro.homework4;

public class Cat extends Animal {



    @Override
    void ran(int runLength) {
        if (runLength >= 0 ) {
            System.out.println("Кіт пробіг " + runLength + " м");
        }
        }


    @Override
    void swim(int swimLength) {
        if (swimLength == 0) {
            System.out.println("Кіт не вміє плавати ");
        } else {
            System.out.println("Кіт проплив " + swimLength + " м");
        }
    }
}

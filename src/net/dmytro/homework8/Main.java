package net.dmytro.homework8;

import static net.dmytro.homework8.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {

       try {
            int result = doCalc(new String[][]{{"1", "a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        try {
            int result = doCalc(new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        try {
            int result = doCalc(new String[][]{{"1", "2", "a", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
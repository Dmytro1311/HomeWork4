package net.homework6;

public class HomeWorkApp {

    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumm(13,5));
        checkNumber(13);
        System.out.println(checkNumbersForNegativity(22));
        printSomeWords("Hello", 4);
        System.out.println(checkYearIsLeap());


    }
    public static void printThreeWords(){

        System.out.println("Orange \nBanana \nApple");
    }
    public static void checkSumSign(){
        int a = 5;
        int b = 8;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Summ is positive");
        }else {
            System.out.println("Summ is negative");
        }


    }
    public static void printColor(){
        int value = 13;
        if (value <= 0){
            System.out.println("Red");
        }
        if (value > 0 && value <= 100){
            System.out.println("Yellow");
            
        }
        if (value > 100){
            System.out.println("Green");

        }
    }
    public static void  compareNumbers(){
        int a = 8;
        int b = 4;
        if(a >= b){
            System.out.println("a >= b ");
        }else {
            System.out.println("a < b");
        }
    }
    public static boolean checkSumm(int a, int b ){
        if ( a + b > 10 && a + b < 20){
            return true;
        }else {
            return false;
        }

    }
    public static void checkNumber(int value){
        if (value >= 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
    public static boolean checkNumbersForNegativity(int number){
        if(number >= 0){
            return false;
        } else {
            return true;
        }

    }
    public static void  printSomeWords(String word,int n){
        for (int i =0; i < n; i++){
            System.out.println(word);
        }
    }
    public static boolean checkYearIsLeap(){
        int year = 2023;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            return true;
        }else {
            return false;
        }

    }



}

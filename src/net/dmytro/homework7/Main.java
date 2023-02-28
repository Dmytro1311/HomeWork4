package net.dmytro.homework7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       System.out.println(findSymbolOccurance("Hello World", 'l'));
        System.out.println(findWordPosition("Hello World", "World"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("rotator"));
        wordsGame();
    }
    public static int findSymbolOccurance(String line, char symbol ){
        int counter = 0;
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == symbol){
                counter++;
            }

        }
        return counter;

    }
    public static int findWordPosition(String source, String target){
            return source.indexOf(target);

        }



    public static String stringReverse(String line){

         return new StringBuilder(line).reverse().toString();
    }
    public static boolean isPalindrome(String line){
        StringBuilder stringBuilder = new StringBuilder(line);
        return line.equals(stringBuilder.reverse().toString());
    }

    public static void wordsGame(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String randomName = words[random.nextInt(words.length)];
        System.out.println(randomName);
        System.out.println("You have to guess a word! It maybe one of the following:");
        System.out.println(Arrays.toString(words));

        String myGuess;
        StringBuilder lettersInPlace;
        boolean continueToInvent = true;

        while (continueToInvent){
            System.out.println("Which word do you think I have selected?");
            myGuess = scanner.nextLine();
            if (myGuess.equals(randomName)){
                System.out.println("Correct");
                continueToInvent = false;
            }
                lettersInPlace = new StringBuilder("###############");

            for (int i = 0; i < Math.min(myGuess.length(), randomName.length()); i++){
                if (myGuess.charAt(i) == randomName.charAt(i)){
                    lettersInPlace.setCharAt(i,myGuess.charAt(i));
                }
            }

            System.out.println(lettersInPlace);




        }



    }
}

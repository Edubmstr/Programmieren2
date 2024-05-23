package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[4];
        System.out.println(numbers);
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Stellen soll das Password betragen?");
        int length = scanner.nextInt();

        System.out.println(length);
        

        

    }

    public static String generatePassword(int length){
        Random random = new Random();
        String [] randomChars = {"a","b","c","d","e,","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","EFGHIJKLMNOPQRSTUVWXYZ1234567890"};
        String generatedPassword;
        int index;
        for (int i = 0; i < 7; i++) {
            index = random.nextInt(5);
            //generatedPassword randomChars[index];
        }
        //String password = Arrays.toString()


        //return ;
        return "hello";
    }
}
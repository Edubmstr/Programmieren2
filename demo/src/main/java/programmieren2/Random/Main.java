package programmieren2.Random;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }

    public static String generatePassword(){
        String generatedCharacters = "";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Stellen soll das Passwort haben?");
        int digits = scanner.nextInt();

        while(digits < 8){
            System.out.println("Ein sicheres Passwort sollte mindestens 8 Zeichen haben. Bitte Zahl auf mehr als 8 Zeichen erhöhen.");
            digits = scanner.nextInt();
        }

        System.out.println("Sollen auch Kleinbuchstaben verwendet werden?");
        String characterSet = scanner.next();

        if(characterSet.toLowerCase().equals("ja")){
            generatedCharacters = generateCharacters(digits, 'U');
            generatedCharacters = generatedCharacters + generateCharacters(digits, 'L');
        }else{
            generatedCharacters = generateCharacters(digits, 'U');
        }

        System.out.println("Sollen Zahlen verwendet werden?");
        String useNumbers = scanner.next();

        if(useNumbers.toLowerCase().equals("ja")){
            generatedCharacters = generatedCharacters + (generateCharacters(digits, 'N'));
        }

        System.out.println("Sollen Sonderzeichen verwendet werden?");
        String useSpecialCharacters = scanner.next();

        if(useSpecialCharacters.toLowerCase().equals("ja")){
            generatedCharacters = generatedCharacters + (generateCharacters(digits, 'S'));
        }

        char [] characterArray = generatedCharacters.toCharArray();
        char[] password = new char[digits];

        password[0] = characterArray[0];
        password[digits / 4] = characterArray[0 + (digits / 2)];
        password[digits / 2] = characterArray[digits];
        password[digits - 1] = characterArray[digits + (digits / 2)];
       
        for (int i = 1; i < digits; i++) {
            if(i == (digits / 4) || i == (digits / 2) || i == (digits - 1)){
                continue;
            }
            password[i] = characterArray[random.nextInt(characterArray.length)];
        }
        
        
        scanner.close();
        return new String(password);
    }

    private static String generateCharacters(int digits, char param){
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String specialCharacters = "!$%&/()=?+-*#";
        Random random = new Random();
        char [] output = new char[digits / 2];

        switch(param){
            case 'U': 
                char[] splittedU = uppercase.toCharArray();
                for (int i = 0; i < digits / 2; i++) {
                    output[i] = splittedU[random.nextInt(26)];
                }
                break;
            case 'L':
                char[] splittedL = lowercase.toCharArray();
                for (int i = 0; i < digits / 2; i++) {
                    output[i] = splittedL[random.nextInt(26)];
                }
                break;
            case 'N':
                char[] splittedN = numbers.toCharArray();
                for (int i = 0; i < digits / 2; i++) {
                    output[i] = splittedN[random.nextInt(10)];
                }
                break;
            case 'S':
                char[] splittedS = specialCharacters.toCharArray();
                for (int i = 0; i < digits / 2; i++) {
                    output[i] = splittedS[random.nextInt(12)];
                }
                break;
        }
        return new String(output);
    }

}
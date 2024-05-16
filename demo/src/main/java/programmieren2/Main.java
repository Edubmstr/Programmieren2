package programmieren2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String specialCharacters = "!$%&/()=?+-*#";

        char[] splitted = lowercase.toCharArray();
        System.out.println(Arrays.toString(splitted));

        String password = new String(splitted);
        System.out.println(password);

        generatePassword();
    }

    public static int generatePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Stellen soll das Passwort haben?");
        int digits = scanner.nextInt();

        System.out.println("Sollen auch Kleinbuchstaben verwendet werden?");
        String characterSet = scanner.next();

        System.out.println("Sollen Zahlen verwendet werden?");
        String useNumbers = scanner.next();

        System.out.println("Sollen Sonderzeichen verwendet werden?");
        String useSpecialCharacters = scanner.next();

        return 0;
    }

    private String generateCharacters(int digits, char param){
        switch(param){
            case 'U':

            case 'L':

            case 'N':

            case 'S':
        }
        return "hello";
    }

}
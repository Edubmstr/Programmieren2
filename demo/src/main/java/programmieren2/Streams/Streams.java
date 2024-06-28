package programmieren2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> streamList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            streamList.add(i);
        }

        List<Integer> oddNumbers = streamList.stream()
            .filter(x -> x%2 != 0)
            .collect(Collectors.toList());

        //sorted verwenden

        System.out.println(oddNumbers.toString());

        List<Integer> evenNumbers = streamList.stream()
            .filter(x -> x%2 == 0)
            .collect(Collectors.toList());

        System.out.println(evenNumbers.toString());

        List<Integer> mod5 = streamList.stream()
            .filter(x -> x%10 == 5)
            .collect(Collectors.toList());

        System.out.println(mod5.toString());

        List<Integer> randomNumber = streamList.stream()
            .map(x -> x = (int) random.nextDouble(-1.0 , 1.0))
            .collect(Collectors.toList());

        System.out.println(randomNumber.toString());
        
    }

}

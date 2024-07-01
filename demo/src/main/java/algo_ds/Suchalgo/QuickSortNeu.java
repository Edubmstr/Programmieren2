package algo_ds.Suchalgo;

import java.util.ArrayList;
import java.util.Random;

public class QuickSortNeu {

    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 20; i++) {
            input.add(random.nextInt(100));
        }

        System.out.println(input.toString());

        System.out.println(quickSort(input));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> input){
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        int length = input.size();

        if(length < 2) return input;

        int pointer = input.get(0);
        //input.remove(0);
        
        for (int i = 1; i < input.size(); i++) {
            if(input.get(i) < pointer){
                left.add(input.get(i));
            }else{
                right.add(input.get(i));
            }
        }

        ArrayList<Integer> sortedLeft = quickSort(left);
        ArrayList<Integer> sortedRight= quickSort(right);

        numbers.addAll(sortedLeft);
        numbers.add(pointer);
        numbers.addAll(sortedRight);
        return numbers;
    }

}

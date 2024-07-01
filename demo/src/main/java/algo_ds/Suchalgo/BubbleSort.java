package algo_ds.Suchalgo;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<Integer> numbers){
        int temp;
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) > numbers.get(j)){
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }

    public static void bubbleSortImproved(List<Integer> numbers){
        boolean swapped = false;
        int temp;
        int highIndex = numbers.size();

        do {
            for (int j = 1; j < highIndex; j++) {
                if(numbers.get(j) < numbers.get(j - 1)){
                    temp = numbers.get(j);
                    numbers.set(j, numbers.get(j - 1));
                    numbers.set(j - 1, temp);
                    swapped = true;
                    highIndex--;
                }else{
                    swapped = false;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(6, 3, 1, 9, 25, 4, 28, 30, 8, 15, 11, 5, 19, 13, 2, 10, 40, 32, 21, 50, 23);

        System.out.println(numbers.toString());

        long start1 = System.nanoTime();
        bubbleSort(numbers);
        long end1 = System.nanoTime();
        System.out.println("BubbleSort Normal "+ (end1-start1));

        System.out.println(numbers.toString());

        long start2 = System.nanoTime();
        bubbleSortImproved(numbers);
        long end2 = System.nanoTime();
        System.out.println("BubbleSort Optimized "+ (end2-start2));

        System.out.println(numbers.toString());
    }

}

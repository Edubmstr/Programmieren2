package algo_ds.Suchalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(6, 3, 1, 9, 25, 4, 28, 30, 8, 15, 11, 5, 19, 13, 2, 10, 40, 32, 21, 50, 23);
        ArrayList<Integer> input = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            input.add(random.nextInt(100));
        }

        System.out.println(input.toString());

        quickSort(input);

        System.out.println(input.toString());
    }

    public static void quickSort(ArrayList<Integer> numbers){
        int length = numbers.size() - 2;

        if(length < 2) return;

        int pointer = numbers.get(length / 2);
        numbers.remove(length / 2);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        

        for (int i = 0; i < length; i++) {
            if(numbers.get(i) < pointer){
                left.add(numbers.get(i));
            }
            if(numbers.get(i) > pointer){
                right.add(numbers.get(i));
            }
        }

        left.add(pointer);
        
        /*if(right.size() == 0){
            right.add(Collections.max(left));
            
            }

        if(left.size() == 0){
            left.add(Collections.min(left));
            right.remove(0);
        }*/

        quickSort(left);
        quickSort(right);

        merge(numbers, left, right);
    }

    public static void merge(ArrayList<Integer> numbers, ArrayList<Integer> left, ArrayList<Integer> right){
        int leftLength = left.size();
        int rightLength = right.size();
        int a =0, b = 0, c = 0;

        while (a < leftLength && b < rightLength){
            if(left.get(a) < right.get(b)){
                //numbers[c] = left[a];
                numbers.set(c, left.get(a));
                a++;
            }else{
                //numbers[c] = right[b];
                numbers.set(c, right.get(b));
                b++;
            }
            c++;
        }
        while(a < leftLength){
            //numbers[c] = left[a];
            numbers.set(c, left.get(a));
            c++;
            a++;
        }
        while(b < rightLength){
            //numbers[c] = right[b];
            numbers.set(c, right.get(b));
            b++;
            c++;
        }
    }

}

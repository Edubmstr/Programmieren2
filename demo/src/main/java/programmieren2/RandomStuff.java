package programmieren2;

import java.util.Arrays;
import java.util.Random;

public class RandomStuff {
    public static void main(String[] args){
        int[] numbers = new int[15];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(mergeSort(numbers)));


    }

    public static int[] mergeSort(int[] numbers){
        int [] left = new int[numbers.length / 2];
        int [] right = new int[numbers.length - (numbers.length / 2)];

        if(numbers.length < 2){
            return numbers;
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            left[i] = numbers[i];
        }

        for (int i = numbers.length - (numbers.length / 2); i < numbers.length; i++) {
            right[i- (numbers.length / 2)] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);

        return mergeArray(numbers, left, right);
    }

    public static int[] mergeArray(int[] numbers, int[] left, int[] right){
        int leftLength = left.length;
        int rightLength = right.length;
        int a = 0, b = 0, c = 0;

        while(a < leftLength && b < rightLength){
            if(left[a] < right[b]){
                numbers[c] = left[a];
                a++;
                c++;
            }else{
                numbers[c] = right[b];
                b++;
                c++;
            }
        }

        while(a < leftLength){
            numbers[c] = left[a];
            a++;
        }

        while(b < rightLength){
            numbers[c] = right[b];
            b++;
        }

        return numbers;
    }

}

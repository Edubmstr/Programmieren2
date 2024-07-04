package algo_ds.Suchalgo;

import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> input){

        if(input.size() < 2){
            return input;
        }
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int halfIndex = input.size() / 2;

        for (int i = 0; i < halfIndex; i++) {
            left.add(input.get(i));
        }

        for (int i = halfIndex; i < input.size(); i++) {
            right.add(input.get(i));
        }

        ArrayList<Integer> splittedLeft = sort(left);
        ArrayList<Integer> splittedRight = sort(right);
        return merge(splittedLeft, splittedRight);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> numbers = new ArrayList<>();
        int leftLength = left.size();
        int rightLength = right.size();
        int a =0, b = 0;

        while (a < leftLength && b < rightLength){
            if(left.get(a) < right.get(b)){
                numbers.add(left.get(a));
                a++;
            }else{
                numbers.add(right.get(b));
                b++;
            }
        }
        while(a < leftLength){
            numbers.add(left.get(a));
            a++;
        }
        while(b < rightLength){
            numbers.add(right.get(b));
            b++;
        }
        return numbers;
    }

}

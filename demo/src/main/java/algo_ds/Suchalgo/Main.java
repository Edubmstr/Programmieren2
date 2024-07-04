package algo_ds.Suchalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>();
        List<String> list1 = Arrays.asList("Hallo", "Test", "1234", "Hallo");
        List<String> list2 = Arrays.asList("Test", "1234", "Hallo", "Hallo");
        List<Integer> list3 = Arrays.asList(123, 112, 456, 112);
        List<Integer> list4 = Arrays.asList(112, 123, 112, 456);
        Random random = new Random();
        
        for (int i = 0; i < 20; i++) {
            input.add(random.nextInt(100));
        }

        //System.out.println(input.toString());

        /*long start2 = System.nanoTime();
        //System.out.println(QuickSortNeu.quickSort(input));
        QuickSortNeu.quickSort(input);
        long end2 = System.nanoTime();
        System.out.println("QuickSort Normal "+ (end2-start2));

        long start1 = System.nanoTime();
        BubbleSort.bubbleSortImproved(input);
        long end1 = System.nanoTime();
        //System.out.println(input);
        System.out.println("BubbleSort Normal "+ (end1-start1));*/

        System.out.println(input.toString());

        System.out.println(MergeSort.sort(input));

        System.out.println(CompareTwoLists.compare(list1, list2));
        System.out.println(CompareTwoLists.compare(list3, list4));
        
    }

}

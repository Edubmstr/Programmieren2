package algo_ds.Übungen;

import java.util.ArrayList;

public class HeapSort {

    public ArrayList<Integer> heapSort(MyHeapImpl heap){
        ArrayList<Integer> sortedList = new ArrayList<>();
        int currentValue;

        while(!heap.isEmpty()){
            currentValue = heap.getRoot();
            sortedList.add(currentValue);
            heap.remove(currentValue);
        }
        return sortedList;
    }

}

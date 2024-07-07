package algo_ds.Suchalgorithmen;

public class SelectionSort {

    public static void selectionSort(int [] numbers){
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexMin = i;
            for (int j = i + 1; j < length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    indexMin = j;
                }
            }
            swap(numbers, i, indexMin);
        }
    }

    private static void swap(int[] numbers, int i, int indexMin) {
        int temp = numbers[i];
        numbers[i] = numbers[indexMin];
        numbers[indexMin] = temp;
    }
}

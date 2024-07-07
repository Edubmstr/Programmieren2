package algo_ds.Suchalgorithmen;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public int[] sortieren(int[] liste) {
        for (int i = 1; i < liste.length; i++) {
            int min = liste[i];
            int j = i - 1;
            while (j >= 0 && liste[i] > min) {
                liste[j + 1] = liste[j];
                j--;
            }
            liste[j + 1] = min;
        }
        return liste;
    }

    public <T extends Comparable<T>> List<T> optimizedInsertionSort(List<T> list) {
        List<T> result = new ArrayList<>();
        boolean inserted = false;
        int i = 0;

        for (T item : list) {
            while (!inserted) {
                if (i == result.size()) {
                    result.add(item);
                    inserted = true;
                } else if (item.compareTo(result.get(i)) < 0) {
                    result.add(i, item);
                    inserted = true;
                } else {
                    i++;
                }
            }
        }

        return result;
    }
}

package algo_ds.Klausurvorbereitung.Übungen;

import java.util.List;

public class CompareTwoLists {

    public static <T extends Comparable> boolean compare(List<T> list1, List<T> list2){
        list1.sort(null);
        list2.sort(null);

        return list1.equals(list2);

        //remove ansatz
    }

}

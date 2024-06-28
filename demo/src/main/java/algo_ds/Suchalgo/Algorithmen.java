package algo_ds.Suchalgo;

import java.util.ArrayList;
import java.util.List;

public class Algorithmen implements Suche{

    @Override
    public <E extends Comparable<T>, T> int sequentialSearch(List<E> list, T item) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(item) == 0) return i;
        }
        return -1;
    }

    @Override
    public <E extends Comparable<T>, T> int binarySearch(List<E> list, T item) {
        int middleIndex = list.size() - (list.size()/ 2);
        int highIndex = list.size() - 1;

        while(list.get(middleIndex).compareTo(item)  != 0){
            if(list.get(middleIndex).compareTo(item) > 0){
                highIndex = middleIndex;
                middleIndex = (middleIndex / 2) - 1;

            }else{
                middleIndex = highIndex - (middleIndex  / 2) + 1;
            }
            if(middleIndex >= list.size()) return -1;
        }

        return middleIndex;
    }

    public static void main(String[] args ){
        List<Integer> numbers = new ArrayList<>();

        /*for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }*/
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(19);
        numbers.add(22);

        Algorithmen suche = new Algorithmen();

        System.out.println(suche.binarySearch(numbers,22));
    }

}

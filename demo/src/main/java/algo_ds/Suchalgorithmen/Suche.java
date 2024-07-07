package algo_ds.Suchalgorithmen;

import java.util.List;

public interface Suche {
    //public <T extends Comparable<T>> int sequentialSearch(Node<T> firstNode, T item);
    public <E extends Comparable<T>, T> int sequentialSearch(List<E> list, T item);
    public <E extends Comparable<T>, T> int binarySearch(List<E> list, T item);

}

package algo_ds.Übungen;

public interface MyHeap<T> {
    void heapify();
    T getRoot();
    T get(int index);
    T insert(T value);
    T remove(T value);
    int getIndex(T value);
    boolean isEmpty();
}

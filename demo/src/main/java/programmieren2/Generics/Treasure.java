package programmieren2.Generics;

public class Treasure<T> {
    private T treasure;

    public Treasure(T treasure){
        this.treasure = treasure;
    }

    public String toString(){
        return this.treasure.toString();
    }

    public T getElement(){
        return this.treasure;
    }

}

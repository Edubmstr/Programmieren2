package programmieren2.Generics;

public class Main {
    public static void main(String[] args){
        TreasureBox box = new TreasureBox();
        Treasure<String> t1 = new Treasure<String>("Schatz");
        Treasure<Integer> t2 = new Treasure<Integer>(3000);
        Treasure<Double> t3 = new Treasure<Double>(5.0002);

        box.addTreasure(t1);
        box.addTreasure(t2);
        box.addTreasure(t3);

        System.out.println(box.getTreasures());
        System.out.println(t1.getElement());
    }

}

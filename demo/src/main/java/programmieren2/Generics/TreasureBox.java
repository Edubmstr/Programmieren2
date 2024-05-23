package programmieren2.Generics;

import java.util.ArrayList;

public class TreasureBox {
    private ArrayList<Treasure<?>> treasures = new ArrayList<Treasure<?>>();

    TreasureBox(){

    }

    public ArrayList<Treasure<?>> getTreasures(){
        return this.treasures;
    }

    public void addTreasure(Treasure<?> treasure){
        this.treasures.add(treasure);
    }

}

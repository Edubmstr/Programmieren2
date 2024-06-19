package algo_ds;

public enum BarAngebot {
    BIER ("2"),
    WEIN ("2.5"),
    COLA ("1.5"),
    FANTA ("1.5"),
    MAITAI ("10"),
    SHOTS ("1");

    public String price;

    BarAngebot(String string) {
        this.price = string;
    }
    
    public String getPrice(){
        return this.price;
    }


}

package programmieren2.Random;

public class Car {
    private String brand;
    private int hp;
    private float current_speed;

    Car(String brand, int hp){
        this.brand = brand;
        this.hp = hp;
    }

    protected Car(){
        
    }

    public float drive(float amount){
        this.current_speed += amount;
        return this.current_speed;
    };
}

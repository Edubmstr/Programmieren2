package algo_ds;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BarBestellungen orders = new BarBestellungen();
    static Queue<String> customers = new LinkedList<>();
    public static void main(String[] args){
        addOrder("Julius", BarAngebot.BIER);
        addOrder("Benny", BarAngebot.COLA);
        finishOrder();
        finishOrder();
    }

    public static void addOrder(String customer, BarAngebot order){
        orders.addOrder(order);
        customers.add(customer);
        orders.addOrderPrice(order.getPrice());
    }

    public static void finishOrder(){
        customers.remove();
        orders.removeOrder();
    }

}

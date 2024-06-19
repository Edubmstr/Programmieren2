package algo_ds;

import java.util.LinkedList;
import java.util.Queue;

public class BarBestellungen {
    private Queue<BarAngebot> orders;
    private Queue<String> orderPrices;

    public BarBestellungen(){
        orders = new LinkedList<>();
        orderPrices = new LinkedList<>();
    }

    public void addOrder(BarAngebot order){
        orders.add(order);
    }

    public void addOrderPrice(String price){
        orderPrices.add(price);
    }

    public Queue<BarAngebot> getOrders(){
        return this.orders;
    }

    public Queue<String> getOrderPrices(){
        return this.orderPrices;
    }

    public void removeOrder(){
        orders.remove();
        orderPrices.remove();
    }
}

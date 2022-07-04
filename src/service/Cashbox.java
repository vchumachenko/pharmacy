package service;

import com.model.Order;
import util.PharmacyConst;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;

public class Cashbox implements Runnable {
    private static int idGenerator = 1;

    private final Integer id;
    private final List<Order> orders = new ArrayList<>();
    private final BlockingDeque<Order> allOrders;

    public Cashbox(BlockingDeque<Order> allOrders) {
        this.id = idGenerator++;
        this.allOrders = allOrders;

    }


    @Override
    public void run() {
        while (true){
            try {
                var order  = allOrders.take();
                Thread.sleep(order.products().size() * PharmacyConst.PRODUCT_TIME_COST * 1000L);
                orders.add(order);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public Integer getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

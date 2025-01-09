package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

    @Override
    public void test() {
        // TODO Auto-generated method stub
        System.out.println("Hello from the OrdersBusinessService");
    }
    public List<OrderModel> getOrders()
    {
        // Create a hard-coded list of orders (replace with your actual data source logic)
        List<OrderModel> orders = new ArrayList<>();
        orders.add(new OrderModel(0L, "0000000001", "Product 1", 1.00f, 1));
        orders.add(new OrderModel(1L, "0000000002", "Product 2", 2.00f, 2));
        orders.add(new OrderModel(2L, "0000000003", "Product 3", 3.00f, 3));
        orders.add(new OrderModel(3L, "0000000004", "Product 4", 4.00f, 4));
        orders.add(new OrderModel(4L, "0000000005", "Product 5", 5.00f, 5));
        return orders;
    }
}

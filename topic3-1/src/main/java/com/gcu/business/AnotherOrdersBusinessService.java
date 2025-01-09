package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

    @Override
    public void test() {
        System.out.println("Hello from the AnotherOrdersBusinessService");
    }
    //public List<OrderModel> getOrders();

    @Override
    public List<OrderModel> getOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrders'");
    }
}

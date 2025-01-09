package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.gcu.business.AnotherOrdersBusinessService;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
    //bean annotation definitions
    @Bean(name="ordersBusinessService")
    public OrdersBusinessServiceInterface getOrdersBusinessService()
    {
        return new OrdersBusinessService();
    }

}

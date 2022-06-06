package com.reverside.kutloano.dto;

import com.reverside.kutloano.entity.Address;
import com.reverside.kutloano.entity.Customer;
import com.reverside.kutloano.entity.Order;
import com.reverside.kutloano.entity.OrderItem;
import lombok.Data;

import java.util.List;

 
@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;
}


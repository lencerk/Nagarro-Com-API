package com.reverside.kutloano.service;

import com.reverside.kutloano.dto.Purchase;
import com.reverside.kutloano.dto.PurchaseResponse;

 
public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}

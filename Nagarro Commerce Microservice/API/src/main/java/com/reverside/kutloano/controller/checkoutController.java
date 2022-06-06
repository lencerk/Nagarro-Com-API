package com.reverside.kutloano.controller;

import com.reverside.kutloano.dto.Purchase;
import com.reverside.kutloano.dto.PurchaseResponse;
import com.reverside.kutloano.service.CheckoutService;
import org.springframework.web.bind.annotation.*;
 

@RestController
@CrossOrigin()
@RequestMapping("/api/checkout")
public class checkoutController {

    private CheckoutService checkoutService;


    public checkoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse purchase(@RequestBody Purchase purchase){
        PurchaseResponse response = this.checkoutService.placeOrder(purchase);
        return response;
    }
}

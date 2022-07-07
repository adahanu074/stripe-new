package com.stripe.stripeintegration.controller;

import com.stripe.stripeintegration.service.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    StripeService stripeService;

    @PostMapping("/customer")
    public Object addCustomer(){
        return stripeService.addCustomer();
    }

    @PostMapping("/customer/{customerId}")
    public Object getCustomerById(@PathVariable("customerId") String customerId){
        return stripeService.getCustomerById(customerId);
    }

    @GetMapping("/customers")
    public Object getCustomers(){
        return stripeService.getCustomers();
    }
}

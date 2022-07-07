package com.stripe.stripeintegration.controller;

import com.stripe.exception.StripeException;
import com.stripe.stripeintegration.service.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BalanceController {

    @Autowired
    StripeService stripeService;

    @GetMapping("/")
    public String test(){
        return "Hello world";
    }

    @GetMapping("/balance")
    public Object getBalance()throws StripeException {
        return stripeService.getBalances();
    }

    @GetMapping("/balance-transaction")
    public Object getBalanceTransaction()throws StripeException {
        return stripeService.getBalancesTransaction();
    }
}

package com.stripe.stripeintegration.service;

import com.stripe.stripeintegration.feignclient.StripeFeignClient;
import com.stripe.stripeintegration.model.Address;
import com.stripe.stripeintegration.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    @Autowired
    StripeFeignClient stripeFeignClient;

    public Object getBalances() {
        return stripeFeignClient.getAllBalances();
    }

    public Object getBalancesTransaction() {
        return stripeFeignClient.getAllBalanceTransaction();
    }

    public Object addCustomer() {
        return stripeFeignClient.addCustomer();
    }

    public Object getCustomerById(String customerId){
        return stripeFeignClient.getCustomerById(customerId);
    }

    public Object getCustomers(){
        return stripeFeignClient.getCustomers();
    }
}

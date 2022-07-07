package com.stripe.stripeintegration.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "stripe", url = "https://api.stripe.com", configuration = FeignClientConfig.class)
public interface StripeFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/balance")
    public Object getAllBalances();

    @RequestMapping(method = RequestMethod.GET, value = "/v1/balance_transactions")
    public Object getAllBalanceTransaction();

    @RequestMapping(method = RequestMethod.POST, value = "/v1/customers")
    public Object addCustomer();

    @RequestMapping(method = RequestMethod.GET, value = "/v1/customers")
    public Object getCustomers();

    @RequestMapping(method = RequestMethod.POST, value = "/v1/customers/{customerId}")
    public Object getCustomerById(@PathVariable("customerId") String customerId);
}

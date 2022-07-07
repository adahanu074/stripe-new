package com.stripe.stripeintegration.feignclient;

import feign.Logger;
import feign.RequestInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class FeignClientConfig {

    @Value("${stripe.apikey}")
    String stripeKey;
    @Value("${stripe-account}")
    String account;

    @Bean(value = "logLevel")
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

    @Bean(value = "requestInterceptor")
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", "Bearer " + stripeKey);
        };
    }
}
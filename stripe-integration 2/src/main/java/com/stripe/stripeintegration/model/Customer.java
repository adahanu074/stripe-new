package com.stripe.stripeintegration.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

package com.stripe.stripeintegration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
    private String ciy;
//    @JsonProperty("postal_code")
//    private int postalCode;

    public String getCiy() {
        return ciy;
    }

    public void setCiy(String ciy) {
        this.ciy = ciy;
    }

//    public int getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(int postalCode) {
//        this.postalCode = postalCode;
//    }
}

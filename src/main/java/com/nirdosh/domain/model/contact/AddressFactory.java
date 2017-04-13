package com.nirdosh.domain.model.contact;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AddressFactory {
    public AddressFactory() {
    }

    public List<Address> getAddresse() {
        return Arrays.asList(new Address("im tal",
                                            "12",
                                            "14532",
                                            "brandenburg",
                                            "DE",
                                            AddressType.HOME
        ));
    }
}
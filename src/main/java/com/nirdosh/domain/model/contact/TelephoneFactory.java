package com.nirdosh.domain.model.contact;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TelephoneFactory {
    public TelephoneFactory() {
    }

    public List<Telephone> getTelephone() {
        Telephone telephone = new Telephone("01776773128", TelephoneType.MOBILE);
        return Arrays.asList(telephone);
    }
}
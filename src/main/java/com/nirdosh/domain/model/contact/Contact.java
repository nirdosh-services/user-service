package com.nirdosh.domain.model.contact;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    public List<Telephone> telephones;

    public List<Address> addresses;

    public Contact address(Address address){
        if(addresses == null){
            addresses = new ArrayList<>();
        }
        addresses.add(address);
        return this;
    }

    public Contact telephone(Telephone telephone) {
        if(telephones == null){
            telephones = new ArrayList<>();
        }
        this.telephones.add(telephone);
        return this;
    }
}

package com.nirdosh.domain.model.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactFactory {

    private final TelephoneFactory telephoneMother;
    private final AddressFactory addressMother;

    @Autowired
    public ContactFactory(TelephoneFactory userServiceApplication, AddressFactory addressMother) {
        this.telephoneMother = userServiceApplication;
        this.addressMother = addressMother;
    }

    public Contact createContact() {
        Contact contact = new Contact(telephoneMother.getTelephone(), addressMother.getAddresse());
        return contact;
    }
}
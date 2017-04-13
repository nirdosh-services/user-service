package com.nirdosh.domain.model.contact;

import org.springframework.stereotype.Component;

@Component
public class NameFactory {
    public NameFactory() {
    }

    public Name getName() {
        return new Name("nirdosh", "parmarm", "nikunjkumar");
    }
}
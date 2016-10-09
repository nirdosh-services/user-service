package com.nirdosh.domain.model.contact;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class BasicInfo {

    public Name name;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    public DateTime birthDate;

    public Gender gender;

    public BasicInfo(Name name, DateTime birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }
}

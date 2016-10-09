package com.nirdosh.domain.model.contact;

import java.util.List;

public class ContactInfo {

    public BasicInfo basicInfo;

    public List<Telephone> telephones;

    public List<Address> addresses;

    public AdditionalInfo additionalInfo;

    public boolean ydsMember;

    public AgeGroup ageGroup;

    public List<Category> categories;

    public ContactInfo basicInfo(BasicInfo basicInfo){
        this.basicInfo = basicInfo;
        return this;
    }
}

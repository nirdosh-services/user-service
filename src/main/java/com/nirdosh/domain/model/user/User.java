package com.nirdosh.domain.model.user;

import com.nirdosh.domain.model.contact.AdditionalInfo;
import com.nirdosh.domain.model.contact.Category;
import com.nirdosh.domain.model.contact.Contact;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.Name;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.Itinerary;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    @Id
    public String id;

    public Name name;

    public Date birthDate;

    public Gender gender;

    public Contact contact;

    public AdditionalInfo additionalInfo;

    public List<Category> categories;

    public List<FtpAccount> ftpAccounts;

    public Itinerary itinerary;

    private PaymentInfo paymentInfo;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this).toString();
    }

    public User birthDate(Date date){
        this.birthDate = date;
        return this;
    }

    public User gender(Gender gender){
        this.gender = gender;
        return this;
    }

    public User name(Name name){
        this.name = name;
        return this;
    }

    public User contactInfo(Contact contact) {
        this.contact = contact;
        return this;
    }

    public User ftpAccount(FtpAccount ftpAccount) {
        if (ftpAccounts == null) {
            ftpAccounts = new ArrayList<FtpAccount>();
        }
        ftpAccounts.add(ftpAccount);
        return this;
    }

    public User payment(PaymentInfo paymentInfo){
        this.paymentInfo = paymentInfo;
        return this;
    }

    public User category(Category category) {
        if(categories == null){
            categories = new ArrayList<>();
        }
        categories.add(category);
        return this;
    }

    public User itinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
        return this;
    }
}

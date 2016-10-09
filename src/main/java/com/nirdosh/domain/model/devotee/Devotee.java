package com.nirdosh.domain.model.devotee;

import com.nirdosh.domain.model.contact.ContactInfo;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.TransportInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Devotee {

    @Id
    private String id;

    public ContactInfo contactInfo;

    public List<FtpAccount> ftpAccounts;

    public TransportInfo transportInfo;

    private PaymentInfo paymentInfo;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this).toString();
    }

    public Devotee contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public Devotee ftpAccount(FtpAccount ftpAccount) {
        if (ftpAccounts == null) {
            ftpAccounts = new ArrayList<FtpAccount>();
        }
        ftpAccounts.add(ftpAccount);
        return this;
    }

    public Devotee transport(TransportInfo transportInfo){
        this.transportInfo = transportInfo;
        return this;
    }

    public Devotee payment(PaymentInfo paymentInfo){
        this.paymentInfo = paymentInfo;
        return this;
    }
}

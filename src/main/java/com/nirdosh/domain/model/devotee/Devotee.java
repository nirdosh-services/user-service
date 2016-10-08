package com.nirdosh.domain.model.devotee;

import com.nirdosh.domain.model.contact.AdditionalInfo;
import com.nirdosh.domain.model.contact.Address;
import com.nirdosh.domain.model.contact.Telephone;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.FlightInfo;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.transportation.TrainInfo;
import com.nirdosh.domain.model.transportation.TransportInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

public class Devotee {

    @Id
    private String id;

    private String firstName;

    private String firstNamePassport;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private DateTime birthDate;

    private String lastName;

    private String email;

    private List<Telephone> telephones;

    private List<Address> addresses;

    private boolean ydsMember;

    private AgeGroup ageGroup;

    private List<Category> categories;

    private List<FtpAccount> ftpAccounts;

    private TransportInfo transportInfo;
    private FlightInfo flightInfo;

    private Gender gender;

    private boolean commingFirstTime;

    private boolean commingOnHisOwn;

    private TrainInfo trainInfo;

    private AdditionalInfo additionalInfo;


    private PaymentInfo paymentInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telephone> getTelephones() {
        if(telephones==null){
            telephones = new ArrayList<Telephone>();
        }
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getFirstNamePassport() {
        return firstNamePassport;
    }

    public void setFirstNamePassport(String firstNamePassport) {
        this.firstNamePassport = firstNamePassport;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isYdsMember() {
        return ydsMember;
    }

    public void setYdsMember(boolean ydsMember) {
        this.ydsMember = ydsMember;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<FtpAccount> getFtpAccounts() {
        return ftpAccounts;
    }

    public void setFtpAccounts(List<FtpAccount> ftpAccounts) {
        this.ftpAccounts = ftpAccounts;
    }

    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isCommingFirstTime() {
        return commingFirstTime;
    }

    public void setCommingFirstTime(boolean commingFirstTime) {
        this.commingFirstTime = commingFirstTime;
    }

    public boolean isCommingOnHisOwn() {
        return commingOnHisOwn;
    }

    public void setCommingOnHisOwn(boolean commingOnHisOwn) {
        this.commingOnHisOwn = commingOnHisOwn;
    }

    public TrainInfo getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(TrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }

    public String getMobileIndia() {
        return mobileIndia;
    }

    public void setMobileIndia(String mobileIndia) {
        this.mobileIndia = mobileIndia;
    }


    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }



    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this).toString();
    }
}

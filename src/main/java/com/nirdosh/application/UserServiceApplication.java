package com.nirdosh.application;

import com.nirdosh.domain.model.contact.Address;
import com.nirdosh.domain.model.contact.AddressType;
import com.nirdosh.domain.model.contact.Category;
import com.nirdosh.domain.model.contact.Contact;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.Name;
import com.nirdosh.domain.model.contact.Telephone;
import com.nirdosh.domain.model.contact.TelephoneType;
import com.nirdosh.domain.model.ftp.AccountType;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.FlightDetail;
import com.nirdosh.domain.model.transportation.Itinerary;
import com.nirdosh.domain.model.user.User;
import com.nirdosh.domain.model.user.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;
import java.util.stream.IntStream;

@SpringBootApplication
@ComponentScan("com.nirdosh")
@EnableMongoRepositories("com.nirdosh.domain.model")
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;
    private Object outboundFlight;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        userRepo.deleteAll();
        IntStream.range(1, 10).forEach(p -> {
                User user = new User()
                                .birthDate(new Date())
                                .gender(Gender.MALE)
                                .name(getName())
                                .contactInfo(createContact())
                                .ftpAccount(getFtpAccount())
                                .payment(getPaymentInfo())
                                .category(Category.AMBRISH)
                                .itinerary(getItinerary());
                userRepo.save(user);
            }
        );
    }

    public Contact createContact() {
        Contact contact = new Contact()
                              .address(getAddresse())
                              .telephone(getTelephone());

        return contact;
    }

    public FtpAccount getFtpAccount() {
        FtpAccount ftpAccount = new FtpAccount();
        ftpAccount.accountType = AccountType.SUNDAY_SABHA;
        ftpAccount.userName = "user123";
        ftpAccount.password = "123456";
        return ftpAccount;
    }

    public PaymentInfo getPaymentInfo() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.ist = 10F;
        paymentInfo.soll = 10F;
        return paymentInfo;
    }

    public Name getName() {
        return new Name("nirdosh", "parmarm", "nikunjkumar");
    }

    public Address getAddresse() {
        Address address = new Address();
        address.addressType = AddressType.HOME;
        address.country = "DE";
        address.houseNumber = "12";
        address.plz = "14532";
        address.state = "brandenburg";
        address.streetName = "im tal";
        return address;
    }

    public Telephone getTelephone() {
        Telephone telephone = new Telephone();
        telephone.number = "01776773128";
        telephone.telephoneType = TelephoneType.MOBILE;
        return telephone;
    }

    public Itinerary getItinerary() {
        Itinerary itinerary = new Itinerary()
                                  .outboundFlight(getOutboundFlight())
                                  .returnFlight(getReturnFlight());
        return itinerary;
    }

    public FlightDetail getOutboundFlight() {
        FlightDetail flightDetail = new FlightDetail();
        flightDetail.airline = "AirFrance";
        flightDetail.to = "Mumbai";
        flightDetail.from = "Berlin";
        return flightDetail;
    }

    public FlightDetail getReturnFlight() {
        FlightDetail flightDetail = new FlightDetail();
        flightDetail.airline = "AirFrance";
        flightDetail.to = "Berlin";
        flightDetail.from = "Mumbai";
        return flightDetail;
    }
}

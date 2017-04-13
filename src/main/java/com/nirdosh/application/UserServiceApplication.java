package com.nirdosh.application;

import com.nirdosh.domain.model.contact.AddressFactory;
import com.nirdosh.domain.model.contact.ContactFactory;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.NameFactory;
import com.nirdosh.domain.model.contact.TelephoneFactory;
import com.nirdosh.domain.model.ftp.FtpAccountFactory;
import com.nirdosh.domain.model.payment.PaymentInfoFactory;
import com.nirdosh.domain.model.transportation.FlightDetailsMother;
import com.nirdosh.domain.model.transportation.ItineraryFactory;
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

    private final FlightDetailsMother flightDetailsMother;
    private final ItineraryFactory itineraryMother;
    private final TelephoneFactory telephoneMother;
    private final AddressFactory addressMother ;
    private final NameFactory nameMother;
    private final PaymentInfoFactory paymentInfoMother ;
    private final FtpAccountFactory ftpAccountMother ;
    private final ContactFactory contactMother ;
    private UserRepo userRepo;

    @Autowired
    public UserServiceApplication(FlightDetailsMother flightDetailsMother,
                                  ItineraryFactory itineraryMother,
                                  TelephoneFactory telephoneMother,
                                  AddressFactory addressMother,
                                  NameFactory nameMother,
                                  PaymentInfoFactory paymentInfoMother,
                                  FtpAccountFactory ftpAccountMother,
                                  ContactFactory contactMother,
                                  UserRepo userRepo) {
        this.flightDetailsMother = flightDetailsMother;
        this.itineraryMother = itineraryMother;
        this.telephoneMother = telephoneMother;
        this.addressMother = addressMother;
        this.nameMother = nameMother;
        this.paymentInfoMother = paymentInfoMother;
        this.ftpAccountMother = ftpAccountMother;
        this.contactMother = contactMother;
        this.userRepo = userRepo;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        userRepo.deleteAll();
        IntStream.range(1, 10).forEach(p -> {
                User user = new User(null,
                                        nameMother.getName(),
                                        new Date(),
                                        Gender.MALE,
                                        contactMother.createContact(),
                                        null,
                                        null,
                                        ftpAccountMother.getFtpAccounts(),
                                        itineraryMother.getItinerary(),
                                        paymentInfoMother.getPaymentInfo());
                userRepo.save(user);
            }
        );
    }
}



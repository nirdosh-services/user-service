package com.nirdosh.application;

import com.nirdosh.domain.model.contact.ContactFactory;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.NameFactory;
import com.nirdosh.domain.model.ftp.FtpAccountFactory;
import com.nirdosh.domain.model.payment.PaymentInfoFactory;
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

    private final ItineraryFactory itineraryFactory;
    private final NameFactory nameFactory;
    private final PaymentInfoFactory paymentInfoFactory;
    private final FtpAccountFactory ftpAccountFactory;
    private final ContactFactory contactMother ;
    private UserRepo userRepo;

    @Autowired
    public UserServiceApplication(ItineraryFactory itineraryFactory,
                                  NameFactory nameFactory,
                                  PaymentInfoFactory paymentInfoFactory,
                                  FtpAccountFactory ftpAccountFactory,
                                  ContactFactory contactFactory,
                                  UserRepo userRepo) {
        this.itineraryFactory = itineraryFactory;
        this.nameFactory = nameFactory;
        this.paymentInfoFactory = paymentInfoFactory;
        this.ftpAccountFactory = ftpAccountFactory;
        this.contactMother = contactFactory;
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
                                        nameFactory.getName(),
                                        new Date(),
                                        Gender.MALE,
                                        contactMother.createContact(),
                                        null,
                                        null,
                                        ftpAccountFactory.getFtpAccounts(),
                                        itineraryFactory.getItinerary(),
                                        paymentInfoFactory.getPaymentInfo());
                userRepo.save(user);
            }
        );
    }
}



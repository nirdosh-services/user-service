package com.nirdosh.application;

import com.nirdosh.domain.model.contact.BasicInfo;
import com.nirdosh.domain.model.contact.ContactInfo;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.Name;
import com.nirdosh.domain.model.user.User;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.TransportInfo;
import com.nirdosh.domain.model.user.UserRepo;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.stream.IntStream;

@SpringBootApplication
@ComponentScan("com.nirdosh")
@EnableMongoRepositories("com.nirdosh.domain.model")
public class UserServiceApplication implements CommandLineRunner{

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepo.deleteAll();
		IntStream.range(1, 10).forEach(p -> {
					User user = new User();
					user.contactInfo(getContactInfo());
					user.transport(getTransportInfo());
					user.ftpAccount(getFtpAccount());
					user.payment(getPaymentInfo());

					userRepo.save(user);
				}
		);
	}

	public ContactInfo getContactInfo() {
		ContactInfo contactInfo = new ContactInfo();
		Name name = new Name("nirdosh","parmar","nikunjkumar");
		contactInfo.basicInfo(new BasicInfo(name,new DateTime(), Gender.MALE));
		return contactInfo;
	}

	public TransportInfo getTransportInfo() {
		return new TransportInfo();
	}

	public FtpAccount getFtpAccount() {
		return new FtpAccount();
	}

	public PaymentInfo getPaymentInfo() {
		return new PaymentInfo();
	}
}

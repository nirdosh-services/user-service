package com.nirdosh.application;

import com.nirdosh.domain.model.contact.BasicInfo;
import com.nirdosh.domain.model.contact.ContactInfo;
import com.nirdosh.domain.model.contact.Gender;
import com.nirdosh.domain.model.contact.Name;
import com.nirdosh.domain.model.devotee.Devotee;
import com.nirdosh.domain.model.ftp.FtpAccount;
import com.nirdosh.domain.model.payment.PaymentInfo;
import com.nirdosh.domain.model.transportation.TransportInfo;
import com.nirdosh.infrastructure.persistence.DevoteeRepo;
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
@EnableMongoRepositories("com.nirdosh.infrastructure.persistence")
public class DevoteeServiceApplication implements CommandLineRunner{

	@Autowired
	private DevoteeRepo devoteeRepo;

	public static void main(String[] args) {
		SpringApplication.run(DevoteeServiceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		devoteeRepo.deleteAll();
		IntStream.range(1, 10).forEach(p -> {
					Devotee devotee = new Devotee();
					devotee.contactInfo(getContactInfo());
					devotee.transport(getTransportInfo());
					devotee.ftpAccount(getFtpAccount());
					devotee.payment(getPaymentInfo());

					devoteeRepo.save(devotee);
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

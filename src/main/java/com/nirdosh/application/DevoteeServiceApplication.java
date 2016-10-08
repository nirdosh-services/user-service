package com.nirdosh.application;

import com.nirdosh.domain.model.devotee.Devotee;
import com.nirdosh.infrastructure.persistence.DevoteeRepo;
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
		IntStream.range(1,10).forEach(p -> {
			Devotee devotee =  new Devotee("devotee"+p);
			devoteeRepo.save(devotee);
		}
		);
	}
}

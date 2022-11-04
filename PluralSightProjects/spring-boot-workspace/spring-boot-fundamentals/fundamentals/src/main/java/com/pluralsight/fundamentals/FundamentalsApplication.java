package com.pluralsight.fundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.entity.Release;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import com.pluralsight.fundamentals.repository.ReleaseRepository;

@SpringBootApplication
public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("trackzilla", "kesha.williams", "application for tracking bugs."));
			repository.save(new Application("expenses", "mary.jones", "application to track expense reports."));
			repository.save(
					new Application("notifications", "karen.kane", "application to send alerts and notifications to users."));

			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}

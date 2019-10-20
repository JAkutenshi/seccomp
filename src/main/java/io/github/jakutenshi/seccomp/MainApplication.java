package io.github.jakutenshi.seccomp;

import io.github.jakutenshi.seccomp.organizations.Organization;
import io.github.jakutenshi.seccomp.organizations.OrganizationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(OrganizationRepository repository) {
		return args -> {


			//repository.save(new Organization("Рога и копыта", "Торжковская 15", "+79311234567"));
			for (Organization o : repository.findByLegalAddress("Торжковская 15")) {
				System.out.println(o.toString());
			}
		};
	}

}

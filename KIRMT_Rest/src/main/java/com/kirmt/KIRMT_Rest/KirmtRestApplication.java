package com.kirmt.KIRMT_Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KirmtRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KirmtRestApplication.class, args);
	}

}

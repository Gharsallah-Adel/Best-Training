package com.TekUp.bestTrainig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = "com.TekUp.bestTrainig")
public class BestTrainigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestTrainigApplication.class, args);
	}

}

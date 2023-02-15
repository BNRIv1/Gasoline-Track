package dians.microservices.stationsinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StationsInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationsInfoServiceApplication.class, args);
	}

}

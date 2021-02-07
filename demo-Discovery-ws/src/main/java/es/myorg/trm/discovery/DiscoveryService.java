package es.myorg.trm.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = {"es.myorg.trm"})
public class DiscoveryService {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService.class, args);
	}

}

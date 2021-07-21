package com.devd.spring.bookstoreeurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-14
 */
@SpringBootApplication
//@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
@EnableEurekaServer
public class BookstoreEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreEurekaDiscoveryServiceApplication.class, args);
	}

}

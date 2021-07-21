package com.devd.spring.bookstoreapigatewayservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-14
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
@EnableZuulProxy
@EnableDiscoveryClient
public class BookstoreApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApiGatewayServiceApplication.class, args);
	}

}

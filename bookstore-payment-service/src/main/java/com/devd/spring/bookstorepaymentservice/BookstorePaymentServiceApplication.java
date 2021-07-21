package com.devd.spring.bookstorepaymentservice;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Devaraj Reddy, Date : 25-Jul-2020
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.devd.spring"})
@EnableFeignClients(basePackages = {"com.devd.spring"})
@EnableDiscoveryClient
public class BookstorePaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstorePaymentServiceApplication.class, args);
		Stripe.apiKey = "sk_test_51HyGx6G9R9y827ntfKTizO243LzKHnaNIucO8i7apU0zuTIE5iNAes6l64aoWczGwiCnnBNsvvrgS95nfpbWa2cw00FnScmrhd";
	}

}


package com.jtech.spring_rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jtech")
public class RestApplication {

    private final static Logger LOG = LoggerFactory.getLogger(RestApplication.class);

    public static void main(String[] args) {
	LOG.info(">>>>> >>>>> >>>>> >>>>> >>>>> main");
	SpringApplication.run(RestApplication.class, args);
    }

}

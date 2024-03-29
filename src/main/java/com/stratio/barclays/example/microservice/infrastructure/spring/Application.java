/*
 * $Header$
 *
 * (c) Copyright 2012 BAWAG P.S.K. AG
 * All Rights Reserved
 *
 */
package com.stratio.barclays.example.microservice.infrastructure.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.stratio.barclays.example.microservice")
@EntityScan(basePackages = "com.stratio.barclays.example.microservice.infrastructure")
@EnableJpaRepositories("com.stratio.barclays.example.microservice.infrastructure")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

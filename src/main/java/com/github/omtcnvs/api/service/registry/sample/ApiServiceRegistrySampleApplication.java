package com.github.omtcnvs.api.service.registry.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiServiceRegistrySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServiceRegistrySampleApplication.class, args);
    }

}

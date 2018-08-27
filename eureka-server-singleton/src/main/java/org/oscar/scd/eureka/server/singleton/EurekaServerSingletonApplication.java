package org.oscar.scd.eureka.server.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSingletonApplication.class, args);
    }
}

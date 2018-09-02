package org.oscar.scd.consul.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulServiceApplication {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/appName")
    public String getAppName() {
        return this.appName;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulServiceApplication.class, args);
    }
}

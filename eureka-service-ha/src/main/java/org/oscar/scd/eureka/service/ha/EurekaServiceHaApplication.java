package org.oscar.scd.eureka.service.ha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceHaApplication {

    @Value("${server.port}")
    private int serverPort;

    @RequestMapping("/print")
    public String serverPortPrint(@RequestParam(value = "name", defaultValue = "oscar") String name) {
        return "Hi " + name + " ,i am from port: " + serverPort;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceHaApplication.class, args);
    }
}

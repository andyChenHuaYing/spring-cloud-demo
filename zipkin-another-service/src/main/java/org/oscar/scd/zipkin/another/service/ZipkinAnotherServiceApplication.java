package org.oscar.scd.zipkin.another.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ZipkinAnotherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinAnotherServiceApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/serviceName")
    public String getServiceName() {
        return restTemplate.getForObject("http://localhost:8778/info", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        return "Hi i am zipkin-another-service";
    }
}

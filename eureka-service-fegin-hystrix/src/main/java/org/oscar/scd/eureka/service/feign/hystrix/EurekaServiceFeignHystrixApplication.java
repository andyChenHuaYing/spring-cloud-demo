package org.oscar.scd.eureka.service.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceFeignHystrixApplication.class, args);
    }
}

package org.oscar.scd.eureka.hystrix.dashboard.another;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableHystrix
@RestController
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class EurekaHystrixDashboardAnotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboardAnotherApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/appName")
    @HystrixCommand(fallbackMethod = "errorMsg")
    public String getAppName() {
        return this.appName;
    }

    @SuppressWarnings("unused")
    public String errorMsg() {
        return "Error msg by hystrix.";
    }
}

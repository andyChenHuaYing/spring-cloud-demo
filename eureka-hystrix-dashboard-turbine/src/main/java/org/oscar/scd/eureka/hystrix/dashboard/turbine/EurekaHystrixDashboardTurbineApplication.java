package org.oscar.scd.eureka.hystrix.dashboard.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RestController;

@EnableHystrix
@EnableTurbine
@RestController
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class EurekaHystrixDashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboardTurbineApplication.class, args);
    }

}

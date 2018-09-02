package org.oscar.scd.config.client.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientBusApplication {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/readFooProp")
    public String readFooProp() {
        return this.foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusApplication.class, args);
    }
}

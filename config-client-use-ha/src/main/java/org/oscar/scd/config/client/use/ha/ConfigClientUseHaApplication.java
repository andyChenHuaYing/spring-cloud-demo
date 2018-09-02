package org.oscar.scd.config.client.use.ha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientUseHaApplication {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/readFooProp")
    public String readFooProp() {
        return this.foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientUseHaApplication.class, args);
    }
}

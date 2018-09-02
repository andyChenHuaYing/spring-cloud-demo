package org.oscar.scd.config.server.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerHaApplication.class, args);
    }
}

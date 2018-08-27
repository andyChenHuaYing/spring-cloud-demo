package org.oscar.scd.eureka.service.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbonService {

    @Autowired
    public RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-service//print?name=" + name, String.class);
    }

}

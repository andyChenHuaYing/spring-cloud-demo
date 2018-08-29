package org.oscar.scd.eureka.service.ribbon.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbonHystrixService {

    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-service//print?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "Hi " + name + ", sorry, system error.";
    }

}

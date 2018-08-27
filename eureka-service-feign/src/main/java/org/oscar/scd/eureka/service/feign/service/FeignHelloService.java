package org.oscar.scd.eureka.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-service")
public interface FeignHelloService {

    @RequestMapping("/print")
    String printPort(@RequestParam("name") String name);
}

package org.oscar.scd.eureka.service.feign.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service", fallback = FeignHystrixHelloServiceHystrix.class)
public interface FeignHystrixHelloService {

    @RequestMapping("/print")
    String print(@RequestParam("name") String name);
}

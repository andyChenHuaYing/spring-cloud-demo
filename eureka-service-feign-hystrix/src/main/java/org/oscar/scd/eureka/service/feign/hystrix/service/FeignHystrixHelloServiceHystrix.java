package org.oscar.scd.eureka.service.feign.hystrix.service;

import org.springframework.stereotype.Service;

@Service
public class FeignHystrixHelloServiceHystrix implements FeignHystrixHelloService {

    @Override
    public String print(String name) {
        return "Sorry " + name;
    }
}

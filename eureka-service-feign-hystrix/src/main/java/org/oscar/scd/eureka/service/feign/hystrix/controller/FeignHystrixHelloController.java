package org.oscar.scd.eureka.service.feign.hystrix.controller;

import org.oscar.scd.eureka.service.feign.hystrix.service.FeignHystrixHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign/hystrix")
public class FeignHystrixHelloController {

    @Autowired
    private FeignHystrixHelloService service;

    @RequestMapping("/print")
    public String print(@RequestParam("name") String name) {
        return this.service.print(name);
    }
}

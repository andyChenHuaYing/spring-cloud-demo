package org.oscar.scd.eureka.service.feign.controller;

import org.oscar.scd.eureka.service.feign.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignHelloController {

    @Autowired
    private FeignHelloService service;

    @RequestMapping("/print")
    public String print(@RequestParam("name") String name) {
        return this.service.printPort(name);
    }
}

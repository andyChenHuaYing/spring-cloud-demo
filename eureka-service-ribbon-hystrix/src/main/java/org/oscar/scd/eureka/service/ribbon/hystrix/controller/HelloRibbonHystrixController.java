package org.oscar.scd.eureka.service.ribbon.hystrix.controller;

import org.oscar.scd.eureka.service.ribbon.hystrix.service.HelloRibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon/hystrix")
public class HelloRibbonHystrixController {

    @Autowired
    public HelloRibbonHystrixService service;

    @GetMapping("/print")
    public String print(@RequestParam String name) {
        return this.service.hiService(name);
    }
}

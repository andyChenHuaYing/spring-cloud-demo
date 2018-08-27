package org.oscar.scd.eureka.service.ribbon.controller;

import org.oscar.scd.eureka.service.ribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class HelloRibbonController {

    @Autowired
    public HelloRibbonService service;

    @GetMapping("/print")
    public String print(@RequestParam String name) {
        return this.service.hiService(name);
    }
}

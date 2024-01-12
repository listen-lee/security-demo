package org.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shantui
 * @date 2024/01/12
 **/

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

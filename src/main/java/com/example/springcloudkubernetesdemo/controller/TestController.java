package com.example.springcloudkubernetesdemo.controller;

import com.example.springcloudkubernetesdemo.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestProperties testProperties;
    @Value("${test.value:default}")
    private String value;
    @GetMapping("/test")
    public String test(){
        return  testProperties.toString() +"----"+ value;
    }
}

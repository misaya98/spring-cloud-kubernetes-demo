package com.example.springcloudkubernetesdemo.config;

import lombok.Data;
import lombok.ToString;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "test")
public class TestProperties {
    private String name;
    private Integer age;
}

package com.example.springbootconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("db")
public class DBConfig {
    private String connection;
    private String host;
    private String port;
}

package com.flamexander.cloud.front.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JavaConfig {

    @Bean
    @LoadBalanced // так рест темплейт понимает, что работает с маршрутизатором
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

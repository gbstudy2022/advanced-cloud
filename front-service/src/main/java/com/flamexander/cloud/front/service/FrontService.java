package com.flamexander.cloud.front.service;

import com.flamexander.cloud.common.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FrontService {
    @Autowired
    private RestTemplate restTemplate; //для синхронных вызовов

    public List<ProductDto> findAll() {
        return restTemplate.getForObject("http://product-service/api/v1/products", List.class);
    }
}

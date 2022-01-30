package com.flamexander.cloud.front.service;

import com.flamexander.cloud.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FrontController {
    private final FrontService frontService;

    @GetMapping("/api/v1/products")
    public List<ProductDto> getProducts() {
        return frontService.findAll();
    }
}

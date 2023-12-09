package com.example.productservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * @param header forward tu api gateway.
     */
    @GetMapping("/{productId}")
    public String getProductById(@PathVariable Long productId, @RequestHeader(value = "X-Custom-Header", required = false) String header) {
        // Logic to retrieve product by ID
        log.info("start /product/{productId} header: {}", header);
        log.info("start /product/{productId} productId: {}", productId);
        return "Product details for ID " + productId;
    }

    // Add other CRUD operations here
}
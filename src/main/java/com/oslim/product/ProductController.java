package com.oslim.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {


    @GetMapping
    public String apiRoot() {
        return "Welcome to the product application";
    }
}

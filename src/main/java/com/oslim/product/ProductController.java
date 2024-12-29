package com.oslim.product;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @GetMapping
    public String getAllProducs() {
        return "Welcome to the product application";
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable String id) {
        return "Get single product" + id;
    }
}

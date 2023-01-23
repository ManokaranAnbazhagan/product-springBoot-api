package com.tarento.productspringBootapi.controller;

import com.tarento.productspringBootapi.model.ProductUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tarento.productspringBootapi.service.ProductService;

@RestController
@RequestMapping("/PhoneData")
public class PhoneDataController {
    @Autowired
    private ProductService productService;
    @PostMapping("/addPhoneData")
    public ProductUser addProduct(@RequestBody ProductUser user){
        return productService.addProduct(user);
    }
    @GetMapping("/getPhoneDataByName/{name}")
    public ProductUser getProductUserByName(@PathVariable String name){
        return productService.getProductUserByName(name);
    }
    @GetMapping("/getProductUserByValue/{value}")
    public ProductUser getProductUserBySpecValue(@PathVariable String value){
        return productService.getProductUserBySpecValue(value);
    }
}

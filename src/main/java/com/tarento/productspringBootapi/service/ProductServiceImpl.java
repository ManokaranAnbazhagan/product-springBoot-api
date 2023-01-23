package com.tarento.productspringBootapi.service;

import com.tarento.productspringBootapi.model.ProductUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tarento.productspringBootapi.repository.PhoneDataRepository;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private PhoneDataRepository phoneDataRepository;

    @Override
    public ProductUser getProductUserByName(String name) {
        Optional<ProductUser> pu = phoneDataRepository.findByName(name);
//        return (ProductUser) phoneDataRepository.findByName(Name);
        return pu.get();
    }
    @Override
    public ProductUser addProduct(ProductUser productUser) {
       return phoneDataRepository.save(productUser);
    }
    @Override
    public ProductUser getProductUserBySpecValue(String value) {
        return (ProductUser) phoneDataRepository.findByValue(value);
    }

}

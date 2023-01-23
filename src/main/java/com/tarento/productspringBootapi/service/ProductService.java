package com.tarento.productspringBootapi.service;

import com.tarento.productspringBootapi.model.ProductUser;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public ProductUser getProductUserByName(String Name);

    public ProductUser addProduct(ProductUser productUser);

    public ProductUser getProductUserBySpecValue(String value);
}

package com.tarento.productspringBootapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product_DB")
public class ProductUser {
    @Id
    private int productID;
    private String name;
    private String description;

    private Specification specification1;
    private Specification specification2;

    public ProductUser(int productID, String name, String description, Specification specification1, Specification specification2) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.specification1 = specification1;
        this.specification2 = specification2;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Specification getSpecification1() {
        return specification1;
    }

    public void setSpecification1(Specification specification1) {
        this.specification1 = specification1;
    }

    public Specification getSpecification2() {
        return specification2;
    }

    public void setSpecification2(Specification specification2) {
        this.specification2 = specification2;
    }

    @Override
    public String toString() {
        return "ProductUser{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", specification1=" + specification1 +
                ", specification2=" + specification2 +
                '}';
    }
}

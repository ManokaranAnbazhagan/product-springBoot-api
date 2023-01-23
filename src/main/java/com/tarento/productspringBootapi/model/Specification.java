package com.tarento.productspringBootapi.model;

public class Specification {
    private String specName;
    private String specValue;

    public Specification(String specName, String specValue) {
        this.specName = specName;
        this.specValue = specValue;
    }
    public Specification(){

    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecValue() {
        return specValue;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "specName='" + specName + '\'' +
                ", specValue='" + specValue + '\'' +
                '}';
    }
}


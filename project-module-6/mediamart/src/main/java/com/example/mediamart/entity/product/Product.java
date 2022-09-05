package com.example.mediamart.entity.product;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String model;
    private String codeProduct;
    private String insurance;
    private String origin;
    private String description;
    private String trademark;

    public Product () {
    }

    public Product (Integer id , String name , String model , String codeProduct ,
                    String insurance , String origin , String description , String trademark) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.codeProduct = codeProduct;
        this.insurance = insurance;
        this.origin = origin;
        this.description = description;
        this.trademark = trademark;
    }

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getCodeProduct () {
        return codeProduct;
    }

    public void setCodeProduct (String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getInsurance () {
        return insurance;
    }

    public void setInsurance (String insurance) {
        this.insurance = insurance;
    }

    public String getOrigin () {
        return origin;
    }

    public void setOrigin (String origin) {
        this.origin = origin;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getTrademark () {
        return trademark;
    }

    public void setTrademark (String trademark) {
        this.trademark = trademark;
    }
}

package com.example.mediamart.entity.product.Telephone;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryTelephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "categoryTelephone")
    private List<Telephone> telephoneList;

    public CategoryTelephone () {
    }

    public CategoryTelephone (Integer id , String name) {
        this.id = id;
        this.name = name;
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

    public List<Telephone> getTelephoneList () {
        return telephoneList;
    }

    public void setTelephoneList (List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }
}

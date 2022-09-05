package com.example.mediamart.entity.product.Refrigerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryRefrigerator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "categoryRefrigerator")
    private List<Refrigerator> refrigeratorList;

    public CategoryRefrigerator () {
    }

    public CategoryRefrigerator (Integer id , String name) {
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

    public List<Refrigerator> getRefrigeratorList () {
        return refrigeratorList;
    }

    public void setRefrigeratorList (List<Refrigerator> refrigeratorList) {
        this.refrigeratorList = refrigeratorList;
    }
}

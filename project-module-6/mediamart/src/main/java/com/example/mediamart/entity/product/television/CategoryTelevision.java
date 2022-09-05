package com.example.mediamart.entity.product.television;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryTelevision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "categoryTelevision")
    private List<Television> televisionList;

    public CategoryTelevision () {
    }

    public CategoryTelevision (Integer id , String name) {
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

    public List<Television> getTelevisionList () {
        return televisionList;
    }

    public void setTelevisionList (List<Television> televisionList) {
        this.televisionList = televisionList;
    }
}

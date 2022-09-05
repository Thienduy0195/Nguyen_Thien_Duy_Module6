package com.example.mediamart.entity.product.Refrigerator;

import com.example.mediamart.entity.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Refrigerator extends Product {
    private String volume;
    private Integer numberDoor;
    private String properties;
    private Integer totalVolume;
    private Integer totalVolumeUsage;
    private Integer numberPeopleUsage;
    private Integer freezerCapacity;
    private Integer refrigeratorCapacity;
    private String refrigeratorOuterMaterial;
    private String refrigeratorTrayMaterial;
    private Integer isInvester;
    private String coolingTechnology;
    private String deodorizationTechnology;
    private String feature;
    private String utilities;
    private String size;
    private String imageSlideRefrigerator;

    // Category refrigerator
    @ManyToOne(targetEntity = CategoryRefrigerator.class)
    @JsonBackReference
    private CategoryRefrigerator categoryRefrigerator;

    public Refrigerator () {
    }

    public Refrigerator (Integer id , String name , String model , String codeProduct , String insurance , String origin , String description , String trademark , String volume , Integer numberDoor , String properties , Integer totalVolume , Integer totalVolumeUsage , Integer numberPeopleUsage , Integer freezerCapacity , Integer refrigeratorCapacity , String refrigeratorOuterMaterial , String refrigeratorTrayMaterial , Integer isInvester , String coolingTechnology , String deodorizationTechnology , String feature , String utilities , String size , String imageSlideRefrigerator , CategoryRefrigerator categoryRefrigerator) {
        super(id , name , model , codeProduct , insurance , origin , description , trademark);
        this.volume = volume;
        this.numberDoor = numberDoor;
        this.properties = properties;
        this.totalVolume = totalVolume;
        this.totalVolumeUsage = totalVolumeUsage;
        this.numberPeopleUsage = numberPeopleUsage;
        this.freezerCapacity = freezerCapacity;
        this.refrigeratorCapacity = refrigeratorCapacity;
        this.refrigeratorOuterMaterial = refrigeratorOuterMaterial;
        this.refrigeratorTrayMaterial = refrigeratorTrayMaterial;
        this.isInvester = isInvester;
        this.coolingTechnology = coolingTechnology;
        this.deodorizationTechnology = deodorizationTechnology;
        this.feature = feature;
        this.utilities = utilities;
        this.size = size;
        this.imageSlideRefrigerator = imageSlideRefrigerator;
        this.categoryRefrigerator = categoryRefrigerator;
    }

    public String getVolume () {
        return volume;
    }

    public void setVolume (String volume) {
        this.volume = volume;
    }

    public Integer getNumberDoor () {
        return numberDoor;
    }

    public void setNumberDoor (Integer numberDoor) {
        this.numberDoor = numberDoor;
    }

    public String getProperties () {
        return properties;
    }

    public void setProperties (String properties) {
        this.properties = properties;
    }

    public Integer getTotalVolume () {
        return totalVolume;
    }

    public void setTotalVolume (Integer totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Integer getTotalVolumeUsage () {
        return totalVolumeUsage;
    }

    public void setTotalVolumeUsage (Integer totalVolumeUsage) {
        this.totalVolumeUsage = totalVolumeUsage;
    }

    public Integer getNumberPeopleUsage () {
        return numberPeopleUsage;
    }

    public void setNumberPeopleUsage (Integer numberPeopleUsage) {
        this.numberPeopleUsage = numberPeopleUsage;
    }

    public Integer getFreezerCapacity () {
        return freezerCapacity;
    }

    public void setFreezerCapacity (Integer freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public Integer getRefrigeratorCapacity () {
        return refrigeratorCapacity;
    }

    public void setRefrigeratorCapacity (Integer refrigeratorCapacity) {
        this.refrigeratorCapacity = refrigeratorCapacity;
    }

    public String getRefrigeratorOuterMaterial () {
        return refrigeratorOuterMaterial;
    }

    public void setRefrigeratorOuterMaterial (String refrigeratorOuterMaterial) {
        this.refrigeratorOuterMaterial = refrigeratorOuterMaterial;
    }

    public String getRefrigeratorTrayMaterial () {
        return refrigeratorTrayMaterial;
    }

    public void setRefrigeratorTrayMaterial (String refrigeratorTrayMaterial) {
        this.refrigeratorTrayMaterial = refrigeratorTrayMaterial;
    }

    public Integer getIsInvester () {
        return isInvester;
    }

    public void setIsInvester (Integer isInvester) {
        this.isInvester = isInvester;
    }

    public String getCoolingTechnology () {
        return coolingTechnology;
    }

    public void setCoolingTechnology (String coolingTechnology) {
        this.coolingTechnology = coolingTechnology;
    }

    public String getDeodorizationTechnology () {
        return deodorizationTechnology;
    }

    public void setDeodorizationTechnology (String deodorizationTechnology) {
        this.deodorizationTechnology = deodorizationTechnology;
    }

    public String getFeature () {
        return feature;
    }

    public void setFeature (String feature) {
        this.feature = feature;
    }

    public String getUtilities () {
        return utilities;
    }

    public void setUtilities (String utilities) {
        this.utilities = utilities;
    }

    public String getSize () {
        return size;
    }

    public void setSize (String size) {
        this.size = size;
    }

    public String getImageSlideRefrigerator () {
        return imageSlideRefrigerator;
    }

    public void setImageSlideRefrigerator (String imageSlideRefrigerator) {
        this.imageSlideRefrigerator = imageSlideRefrigerator;
    }

    public CategoryRefrigerator getCategoryRefrigerator () {
        return categoryRefrigerator;
    }

    public void setCategoryRefrigerator (CategoryRefrigerator categoryRefrigerator) {
        this.categoryRefrigerator = categoryRefrigerator;
    }
}

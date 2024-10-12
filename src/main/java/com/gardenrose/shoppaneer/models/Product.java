package com.gardenrose.shoppaneer.models;

public abstract class Product {
    private String _id;
    private String name;
    private float price;
    private String category;
    private String subcategory;
    private String material;
    private String description;
    private String originCountry;
    private String mainPhoto;
    private String brand;
    


    public String getId() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public String getMaterial() {
        return material;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public String getBrand() {
        return brand;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


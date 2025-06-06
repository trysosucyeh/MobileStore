Mobile.java                        package com.mobile.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Mobile {

    @Id
    @GeneratedValue
    private Long id;  // ID as Long type

    private String name;
    private String model;
    private double price;
    private String imageUrl; // Add image URL to Mobile class

    // Default constructor
    public Mobile() {}

    // Constructor with all fields
    public Mobile(String name, String model, double price, String imageUrl) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

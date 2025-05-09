package com.dbconnect.dbConnect.model;

import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class Image {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private String imageUrl;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

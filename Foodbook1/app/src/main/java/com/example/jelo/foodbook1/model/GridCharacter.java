package com.example.jelo.foodbook1.model;

/**
 * Created by jelo on 7/23/2015.
 */
public class GridCharacter {
    private String name , image;

    public GridCharacter(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "GridCharacter{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}


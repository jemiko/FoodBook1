package com.example.jelo.foodbook1.model;

import java.io.Serializable;

/**
 * Created by jelo on 7/23/2015.
 */
public class ListCharacter implements Serializable {
    private String name, image, description;

    public ListCharacter(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ListCharacter{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


package com.project.shoecatalogueappspring.models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int id;
    private String name, model, description, imagePath;
    private int price;
    private List<Colors> Colors;

    public Product() {

    }

    public Product(String name, String model, List<Colors> Colors) {
        this.name = name;
        this.model = model;
        this.Colors = Colors;
    }
}

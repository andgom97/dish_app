package com.example.dishapp;

import java.util.List;

public class Dish {

    String name;
    int moment;
    int diet;
    List<String> ingredients;

    public Dish(String name, int moment, int diet, List<String> ingredients){
        this.name = name;
        this.moment = moment;
        this.diet = diet;
        this.ingredients = ingredients;
    }

    // Getters
    public String getName() { return name; }
    public int getMoment() { return moment; }
    public int getDiet() { return diet; }

    // Setters
    public void setName(String name){ this.name = name; }
    public void setMoment(int moment){ this.moment = moment; }
    public void setDiet(int diet){ this.diet = diet; }
}

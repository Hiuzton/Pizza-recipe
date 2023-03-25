package com.example.myapplication;

public class PizzaItem {
    private int imageResource;
    private String title;
    private String decription;
    private String recipe;

    public PizzaItem(int imageResource, String title, String decription, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.decription = decription;
        this.recipe=recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDecription() {
        return decription;
    }

    public String getRecipe() {
        return recipe;
    }
}

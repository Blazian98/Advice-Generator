package com.example.quiz;

public class Category {
    public static final int Beef = 1;
    public static final int Chicken = 2;
    public static final int Pork = 3;
    public static final int Lamb = 4;
    public static final int Seafood = 5;
    public static final int Pasta = 6;
    public static final int Vegetarian = 7;
    public static final int Dessert = 8;


    private int id;
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
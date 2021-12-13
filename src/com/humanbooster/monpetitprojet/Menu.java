package com.humanbooster.monpetitprojet;

public class Menu {
    private String name;
    private Starter starter;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Menu(String name, Starter starter, MainCourse mainCourse, Dessert dessert) {
        this.name = name;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public float getPrixTotal() {
        float total = this.starter.getPrice() + this.mainCourse.getPrice() + Dessert.getPrice();
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("name='").append(name).append('\'');
        sb.append(", starter=").append(starter);
        sb.append(", mainCourse=").append(mainCourse);
        sb.append(", dessert=").append(dessert);
        sb.append('}');
        return sb.toString();
    }
}

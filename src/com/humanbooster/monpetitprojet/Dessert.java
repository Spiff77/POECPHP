package com.humanbooster.monpetitprojet;

public class Dessert {

    private String name;
    private static float price = 10;

    public Dessert(String name) {
        this.name = name;
    }
    public static float getPrice() {
        return price;
    }

    public static void setPrice(float price) {
        if(price > 20) {
            Dessert.price = 20;
        } else{
            Dessert.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dessert{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(Dessert.price);
        sb.append('}');
        return sb.toString();
    }
}

package com.humanbooster.monpetitprojet;

public class Course {

    private String ref;
    private String name;
    private float price;
    private float minPrice;
    private Category category;
    private Room room;

    public Course(String ref, String name, float price, float minPrice, Room room) {
        this.ref = ref;
        this.name = name;
        this.room = room;
        this.minPrice = minPrice;
        this.setPrice(price);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setPrice(float price) {
        if(price < this.minPrice){
            this.price = 120;
        }else{
            this.price = price;
        }
    }
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }


    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ref='" + ref + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", minPrice=" + minPrice +
                ", category=" + category +
                ", room=" + room +
                '}';
    }
}

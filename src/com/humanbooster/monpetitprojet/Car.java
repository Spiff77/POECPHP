package com.humanbooster.monpetitprojet;

public class Car {

    public String model;
    public int kilometers;
    public String color;

    public Car(String model, int kilometers, String color) {
        this.model = model;
        this.kilometers = kilometers;
        this.color = color;
    }

    public void displayInfos() {
        System.out.println("Voiture de model "+ model + " et de couleur "+color);
        this.displayState();
    }

    public void displayState() {
        if(this.kilometers < 200000) {
            System.out.println("encore de la route à faire");
        }else{
            System.out.println("petite révision s'impose");
        }
    }
}

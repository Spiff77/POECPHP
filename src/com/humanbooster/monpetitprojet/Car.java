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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", kilometers=" + kilometers +
                ", color='" + color + '\'' +
                '}';
    }
}

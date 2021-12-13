package com.humanbooster.monpetitprojet;

import java.util.ArrayList;

public class Owner {
    private String firstName;
    private String lastName;
    private ArrayList cars = new ArrayList();

    public Owner(String firstName, String lastName, Car voiture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cars.add(voiture);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void setCars(ArrayList cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cars=" + cars +
                '}';
    }
}

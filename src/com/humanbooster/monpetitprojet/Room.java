package com.humanbooster.monpetitprojet;

public class Room {
    private String name;
    private int capacity;
    private Teacher responsable;

    public Room(String name, int capacity, Teacher responsable) {
        this.name = name;
        this.responsable = responsable;
        this.capacity = capacity;
    }

    public Teacher getResponsable() {
        return responsable;
    }

    public void setResponsable(Teacher responsable) {
        this.responsable = responsable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", responsable=" + responsable +
                '}';
    }
}

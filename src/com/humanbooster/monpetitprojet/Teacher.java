package com.humanbooster.monpetitprojet;

import java.util.ArrayList;

public class Teacher {
    private String firstname;
    private String lastname;
    private ArrayList rooms = new ArrayList();
    private ArrayList topics = new ArrayList();


    public Teacher(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void add(Room room){
        this.rooms.add(room);
    }

    public ArrayList getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rooms=" + rooms +
                ", topics=" + topics +
                '}';
    }
}

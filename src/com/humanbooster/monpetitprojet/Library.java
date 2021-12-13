package com.humanbooster.monpetitprojet;

import java.util.ArrayList;

public class Library {

    public String name;
    private String address;
    private ArrayList books = new ArrayList();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addBook(Book b){
        this.books.add(b);
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}

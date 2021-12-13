package com.humanbooster.monpetitprojet;

public class Book {

    private String name;
    private String editor;

    public Book(String name, String editor) {
        this.name = name;
        this.editor = editor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}

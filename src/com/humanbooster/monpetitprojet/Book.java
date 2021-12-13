package com.humanbooster.monpetitprojet;

public class Book {

    private String name;
    private String editor;
    private Library library;

    public Book(String name, String editor, Library library) {
        this.name = name;
        this.editor = editor;
        this.library = library;
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

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", editor='" + editor + '\'' +
                ", library=" + library +
                '}';
    }
}

package com.humanbooster.monpetitprojet;

public class Book {

    private String title;
    private int nbPage;

    public Book(String title, int nbPage) {
        this.title = title;
        this.nbPage = nbPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", nbPage=").append(nbPage);
        sb.append('}');
        return sb.toString();
    }
}

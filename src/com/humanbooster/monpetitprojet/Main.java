package com.humanbooster.monpetitprojet;

public class Main {

    public static void main(String[] args) {
        Book b = new Book("Les pages jaunes", 548);
        Person p1 = new Person("Thomas", "Lhomme", 30, b);


        System.out.println(p1.getCategory());
    }
}

/*
Tout attributs en privé
get/set pour tous les attributs à l'exceptions de setCategory
Mettre la logique dans setName (Entre autre, changement de valeur pour category)
Tester
 */

package com.humanbooster.monpetitprojet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category ca = new Category("Langues");
        Category cb = new Category("Sciences");

        Teacher res1 = new Teacher("JeanMich", "Mich");

        Room r1 = new Room("Salle verte", 60);
        Room r2 = new Room("Salle bleu", 40);

        Course c1 = new Course("FR3420", "Cours de français",  120, r1);
        Course c2 = new Course("MA3420", "Cours de Math",  120, r2);

        res1.add(r1);
        res1.add(r2);

        System.out.println(res1);



    }
}

/*
Tout attributs en privé
get/set pour tous les attributs à l'exceptions de setCategory
Mettre la logique dans setName (Entre autre, changement de valeur pour category)
Tester
 */

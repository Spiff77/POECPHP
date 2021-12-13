package com.humanbooster.monpetitprojet;

public class Main {
    public static void main(String[] args) {
        Category ca = new Category("Langues");
        Category cb = new Category("Sciences");

        Teacher res1 = new Teacher("JeanMich", "Mich");

        Room r1 = new Room("Salle verte", 60, res1);
        Room r2 = new Room("Salle bleu", 40, res1);


        Course c1 = new Course("FR3420", "Cours de français", 100, 120, r1);
        Course c2 = new Course("MA3420", "Cours de Math", 150, 120, r2);

        c1.setCategory(ca);
        c2.setCategory(cb);


        System.out.println(
                c2.getRoom().getResponsable().getFirstname() +
                " " + c2.getRoom().getResponsable().getLastname().toUpperCase()
        );

    }
}

/*
Tout attributs en privé
get/set pour tous les attributs à l'exceptions de setCategory
Mettre la logique dans setName (Entre autre, changement de valeur pour category)
Tester
 */

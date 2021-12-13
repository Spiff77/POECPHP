package com.humanbooster.monpetitprojet;

public class Main {
    public static void main(String[] args) {
        Dessert d1 = new Dessert("Mousse au chocolat");
        Dessert d2 = new Dessert("Baba au Rhum");


        System.out.println(d1);
        System.out.println(d2);

        Dessert.setPrice(400);

        System.out.println(d1);
        System.out.println(d2);


        // Dessert.price = 10
        // d1 => name="",
        // d2 => name="",
    }
}

/*
Tout attributs en privé
get/set pour tous les attributs à l'exceptions de setCategory
Mettre la logique dans setName (Entre autre, changement de valeur pour category)
Tester
 */

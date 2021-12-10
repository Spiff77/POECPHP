package com.humanbooster.monpetitprojet;

public class Main {

    public static void main(String[] args) {

        String mName = "Menu du jour";
        Starter s = new Starter("Endives", 10.35f);
        MainCourse mc = new MainCourse("Purée au jambon", 12.41f);
        Dessert d = new Dessert("Baba au rhum", 6.99f);

        Menu m = new Menu(mName, s, mc, d);

        System.out.println(m);

        System.out.println("Le prix total du menu: " + m.getName() + " est de: " + m.getPrixTotal() + "€");

    }
}

/*
Tout attributs en privé
get/set pour tous les attributs à l'exceptions de setCategory
Mettre la logique dans setName (Entre autre, changement de valeur pour category)
Tester
 */

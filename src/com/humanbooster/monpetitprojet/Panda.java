package com.humanbooster.monpetitprojet;

public class Panda {
    private int age;
    private String petitNom;
    private String origine;

    public Panda(int age, String petitNom, String origine) {
        this.age = age;
        this.petitNom = petitNom;
        this.origine = origine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100){
            this.age = 100;
        }else{
            this.age = age;
        }
    }

    public String getPetitNom() {
        return petitNom;
    }

    public void setPetitNom(String petitNom) {
        this.petitNom = petitNom;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }
}

package com.company;

public class Zwembad {
    float Breedte;
    float Lengte;
    float Diepte;

    public Zwembad(float Breedte,float Lengte,float Diepte) {
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }

    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0f, 5.5f, 1.5f);
        System.out.println("BREEDTE: " + z1.Breedte);
        System.out.println("LENGTE: " + z1.Lengte);
        System.out.println("DIEPTE: " + z1.Diepte);
        System.out.println("BEREKENDE INHOUD: " + z1.getInhoud());
        Zwembad z2 = new Zwembad(0.0f, 0.0f, 0.0f);
        z2.setBreedte(2.5f);
        z2.setLengte(100.0f);
        z2.setDiepte(2.0f);
        System.out.println("BEREKENDE INHOUD: " + z2.getInhoud());
    }

    public float getBreedte() {
        return Breedte;
    }

    public void setBreedte(float breedte) {
        Breedte = breedte;
    }

    public float getLengte() {
        return Lengte;
    }

    public void setLengte(float lengte) {
        Lengte = lengte;
    }

    public float getDiepte() {
        return Diepte;
    }

    public void setDiepte(float diepte) {
        Diepte = diepte;
    }

    public float getInhoud(){
        return this.Lengte * this.Breedte * this.Diepte;
    }
}



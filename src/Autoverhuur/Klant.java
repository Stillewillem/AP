package Autoverhuur;

public class Klant {

    String naam;
    double kortingsPersentage;

    public Klant(String naam){
        this.naam = naam;
    }

    public void setKortingsPersentage(double kortingsPersentage) {
        this.kortingsPersentage = kortingsPersentage;
    }

    public double getKortingsPersentage(){
        return this.kortingsPersentage;
    }
}

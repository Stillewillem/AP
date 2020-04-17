package Huisesmelken;

import java.lang.reflect.Array;

public class Huis {

    String adress;
    int bouwjaar;
    int leeftijd;
    String naam;

    public Huis(String adress, int bouwjaar){
        this.adress = adress;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(int leeftijd, String naam) {
        this.leeftijd = leeftijd;
        this.naam = naam;
    }
}

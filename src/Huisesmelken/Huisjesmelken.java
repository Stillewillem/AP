package Huisesmelken;

public class Huisjesmelken {

    public Huisjesmelken(){
    }

    public static void main(String[] args){
        Huis h1 = new Huis("Nijenoord 1", 1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);
        h1.setHuisbaas(p1.leeftijd, p1.naam);
        System.out.println("Huis " + h1.adress + " is gebouwd is in " + h1.bouwjaar + " en heeft huisbaas " + h1.naam + "; leeftijd " + h1.leeftijd + " jaar");
        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);
        h2.setHuisbaas(p2.leeftijd, p2.naam);
        System.out.println("Huis " + h2.adress + " is gebouwd is in " + h2.bouwjaar + " en heeft huisbaas " + h2.naam + "; leeftijd " + h2.leeftijd + " jaar");
    }

}

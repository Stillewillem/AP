package Autoverhuur;

public class Autohuur {

    int aantalDagen;
    Klant huurder;
    Auto gehuurdeAuto;

    public Autohuur(){

    }

    public static void main(String[] args){
        Autohuur ah1 = new Autohuur();
        System.out.println("Eerste autohuur: " + ah1.toString(ah1));
        Klant k = new Klant("Mijnheer de vries");
        k.setKortingsPersentage(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: " + ah1.toString(ah1));
    }

    public void setHuurder(Klant klant){
        this.huurder = klant;
    }

    public String getHuurder(Autohuur naam) {
        return "\n  op naam van: " + naam.huurder.naam + " (korting: " + naam.huurder.kortingsPersentage + "%)";
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto Auto){
        this.gehuurdeAuto = Auto;
    }

    public Object getGehuurdeAuto(Autohuur naam) {
        return "auto type:: " + naam.gehuurdeAuto.type + " met prijs per dag: " + naam.gehuurdeAuto.prijsPerDag;
    }

    public void totaalPrijs(){

    }

    public String toString(Autohuur naam){
        if (naam.huurder == null){
            return "\n  er is geen huurder bekend";
        }
        else {
            return getHuurder(naam);
        }
    }
}

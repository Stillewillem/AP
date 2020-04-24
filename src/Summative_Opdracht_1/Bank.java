package Summative_Opdracht_1;

public class Bank {

    private String locatie;
    private Klant klant;
    private Personeel werknermer;
    private Kluis geld;

    public Bank(String locatie){
        setLocatie(locatie);
    }

    public static void main(String[] args){
        Bank b1 = new Bank("Achter Clarenburg 37, 3511 JH Utrecht");
        Kluis g1 = new Kluis(1230040304);
        b1.setGeld(g1);
        Personeel p1 = new Personeel("Piet", "Jan", 12345678);
        b1.setWerknermer(p1);
        Klant k1 = new Klant("Jort", "Pals", "29/03/2002", 4000);
        b1.setKlant(k1);
        LeningAanvraag l1 = new LeningAanvraag("Persoonlijke lening", 1.056, 50000, 36);
        k1.setLening(l1);
        System.out.println(b1.toString());
    }

    public String toString(){
        LeningAanvraag lening = klant.overeenkomst();
        if (lening.getBedrag() < geld.getAmount()
                && (lening.getBedrag() * lening.getRente()) <
                ((klant.getMaandelijkeInkomsten() * 0.5) * lening.getLooptijdMaanden())){
            return  "Lening overeenkomst: " +
                    "\n Bedrag lening: €" + lening.getBedrag() +
                    "\n Looptijd van: " + lening.getLooptijdMaanden() + " maanden" +
                    "\n Wordt verstrekt aan: " + klant.getVoornaam() + " " +klant.getAchternaam() +
                    "\n Rent: "+ lening.getRente() +
                    "\n Maandelijks terug betalen: €" + ((lening.getBedrag() * lening.getRente()) / lening.getLooptijdMaanden()) +
                    "\n Totaal terug te betalen: €" + (lening.getBedrag() * lening.getRente()) +
                    "\n Verstrekt door: " + werknermer.getVoornaam() + " " + werknermer.getAchternaam() +
                    "\n Adress: " + locatie;
        }
        else {
            return "Lening kan niet verstrekt worden";
        }
    }

    public void setWerknermer(Personeel p){
        this.werknermer = p;
    }

    public Personeel getWerknermer() {
        return werknermer;
    }

    public void setGeld(Kluis geld) {
        this.geld = geld;
    }

    public Kluis getGeld() {
        return geld;
    }

    public void setKlant(Klant k) {
        this.klant = k;
    }

    public Klant getKlant() {
        return klant;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}

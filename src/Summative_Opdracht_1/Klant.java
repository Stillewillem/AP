package Summative_Opdracht_1;


public class Klant implements Mens{

    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private double maandelijkeInkomsten;
    private LeningAanvraag lening;

    public Klant(String voornaam, String achternaam, String geboortedatum, double maandelijkeInkomsten){
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboortedatum(geboortedatum);
        setMaandelijkeInkomsten(maandelijkeInkomsten);
    }

    @Override
    public LeningAanvraag overeenkomst() {
        return lening;
    }

    public void setLening(LeningAanvraag lening) {
        this.lening = lening;
    }

    public LeningAanvraag getLening() {
        return lening;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public double getMaandelijkeInkomsten() {
        return maandelijkeInkomsten;
    }

    public void setMaandelijkeInkomsten(double maandelijkeInkomsten) {
        this.maandelijkeInkomsten = maandelijkeInkomsten;
    }
}

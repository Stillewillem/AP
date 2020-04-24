package Summative_Opdracht_1;

public class Personeel implements Mens{

    private String voornaam;
    private String achternaam;
    private int personeelNummer;
    private LeningAanvraag lening;

    public Personeel(String voornaam, String achternaam, int personeelNummer) {
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setPersoneelNummer(personeelNummer);
    }

    @Override
    public LeningAanvraag overeenkomst() {
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

    public int getPersoneelNummer() {
        return personeelNummer;
    }

    public void setPersoneelNummer(int personeelNummer) {
        int length = String.valueOf(personeelNummer).length();
        if (length == 8) {
            this.personeelNummer = personeelNummer;
        }
        else{
            System.out.println("Personeelnummer heeft geen lengte van 8");
        }
    }
}

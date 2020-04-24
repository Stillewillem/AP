package Summative_Opdracht_1;

public class LeningAanvraag{

    private String soortLening;
    private double rente;
    private double bedrag;
    private int looptijdMaanden;

    public LeningAanvraag(String soortLening, double rente, double bedrag, int looptijdMaanden){
        setSoortLening(soortLening);
        setRente(rente);
        setBedrag(bedrag);
        setLooptijdMaanden(looptijdMaanden);
    }

    public String getSoortLening() {
        return soortLening;
    }

    public void setSoortLening(String soortLening) {
        this.soortLening = soortLening;
    }

    public double getRente() {
        return rente;
    }

    public void setRente(double rente) {
        this.rente = rente;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public int getLooptijdMaanden() {
        return looptijdMaanden;
    }

    public void setLooptijdMaanden(int looptijdMaanden) {
        this.looptijdMaanden = looptijdMaanden;
    }
}

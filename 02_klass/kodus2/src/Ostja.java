public class Ostja {
    String eesNimi;
    String pereNimi;
    String telNum;
    double kontoRaha;

    public Ostja(String eesNimi, String pereNimi, String telNum, double kontoRaha) {
        this.eesNimi = eesNimi;
        this.pereNimi = pereNimi;
        this.telNum = telNum;
        this.kontoRaha = kontoRaha;
    }

    public String getOstjaInfo() {
        return this.eesNimi + " " + this.pereNimi + " " + this.telNum + " " + this.kontoRaha + "EUR";
    }
}

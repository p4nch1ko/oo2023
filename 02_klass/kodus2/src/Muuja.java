public class Muuja {
    String eesNimi;
    String pereNimi;
    String telNum;
    double asjaHind;

    public Muuja(String eesNimi, String pereNimi, String telNum, double asjaHind) {
        this.eesNimi = eesNimi;
        this.pereNimi = pereNimi;
        this.telNum = telNum;
        this.asjaHind = asjaHind;
    }

    public String getMuujaInfo() {
        return this.eesNimi + " " + this.pereNimi + " " + this.telNum + " " + this.asjaHind + "EUR";
    }
}

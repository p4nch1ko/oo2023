public class Isikukood implements Andmed {
    String nimi;
    String isikukood;

    public Isikukood(String nimi, String isikukood){
        this.nimi = nimi;
        this.isikukood = isikukood;
    }
    public String getIsikukoodJaNimi(){
        return "Isikukood: " + this.isikukood + " >" + " | Nimi: " + this.nimi;
    }

    @Override
    public String getSugu() {
        return null;
    }

    @Override
    public String getKuupäev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}

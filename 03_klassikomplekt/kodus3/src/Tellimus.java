import java.util.Scanner;

public class Tellimus {
    Klient klient;
    String tuup;
    String nimetus;
    int hind;
    int kogus;

    public Tellimus(String tuup, String nimetus, int hind, int kogus, Klient klient) {
        this.tuup = tuup;
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;
        this.klient = klient;
    }

    void uusTellimus(){
        System.out.println("Oli tehtud uus tellimus!");
    }
    public void infoTellimus() {
        System.out.println("Uus tellimus: " + this.tuup + " " + this.nimetus + " hind: " + this.hind + "€, klient: laud " + this.klient.lauaNumber);
    }

}

public class Main {


    public static void main(String[] args) {

        double ostjaKontoRaha = 30;
        double toodehindHind = 15;

        Ostja ostja = new Ostja("Kaja", "Tamm", "99392030", ostjaKontoRaha);
        Muuja muuja = new Muuja("Tom", "Kase", "8384027", toodehindHind);

        System.out.println("Ostja info: " + ostja.getOstjaInfo());
        System.out.println("Müüja info: " + muuja.getMuujaInfo());

        System.out.println("Asja hind: " + toodehindHind + "EUR");

        System.out.println("Asi oli ostud!");
        ostaToode(muuja, ostja);
        System.out.println();

        System.out.println("Ostja konto raja jääk: " + ostja.kontoRaha + "EUR");

    }

    private static void ostaToode(Muuja muuja, Ostja ostja){
        ostja.kontoRaha = ostja.kontoRaha - muuja.asjaHind;
    }
}
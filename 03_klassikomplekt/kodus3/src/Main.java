public class Main {

        public static void main(String[] args) {
            Klient klient = new Klient(2);
            Tellimus tellimus = new Tellimus("pearoog", "supp", 4, 1, klient);
            tellimus.klient = klient;
            //System.out.println("Laua number: " + tellimus.klient.lauaNumber);
            tellimus.uusTellimus();
            tellimus.infoTellimus();
            String vastus = tellimus.klient.kustutaTellimus();
            System.out.println(vastus);
        }


    }

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class Main {

//    Harmooniline keskmine

//* Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu
//  läbimise kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.
//
//* Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h).
//  Väljasta kogu selle tee läbimise keskmine kiirus.
//
//* Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse failist, kogu teekonna läbimise keskmine
//  kiirus salvestatakse faili.

//  kiirusedTekstiFail.txt  <-- teksti fail kus on kiirused

    public static void main(String[] args) {
        double kiirus1 = 65.0; // km/h
        double kiirus2 = 40.0; // km/h
        double keskmine1 = keskmineKiirus(kiirus1, kiirus2);
        System.out.println("Keskmine kiirus: " + keskmine1 + " km/h");

        // ------------------------------------------------------------------------------------

        double[] antudKiirused = { 30.0, 80.0, 65.0, 40.0, 75.0 }; // km/h
        double keskmine2 = keskmineKiirustest(antudKiirused);
        System.out.println("Keskmine kiirus antud kiirustest oli: " + keskmine2 + " km/h");

        // ------------------------------------------------------------------------------------

        Scanner scanner = new Scanner(new File("kiirused.txt"));

        double kiirusedSumma = 0;
        int kmKokku = 0;
        while (scanner.hasNextDouble()){
            kiirusedSumma += scanner.nextDouble();
            kmKokku++;
        }

        double keskmine3 = kiirusedSumma / kmKokku;

        PrintWriter pw = new PrintWriter("keskminekiirus.txt");
        pw.printf("%.2f", keskmine3);
        pw.close();
    }


    public static double keskmineKiirus(double kiirus1, double kiirus2) {
        double kiirusSumma = kiirus1 + kiirus2;
        double keskmine1 = kiirusSumma / 2;
        return(keskmine1);
    }

    public static double keskmineKiirustest(double[] antudKiirused) {
        double kokku = antudKiirused.length;
        double summa = 0;
        for (int i = 0; i < antudKiirused.length; i++) {
            summa += antudKiirused[i];
        }
        double keskmine2 = summa / kokku;
        return (keskmine2);
    }



}
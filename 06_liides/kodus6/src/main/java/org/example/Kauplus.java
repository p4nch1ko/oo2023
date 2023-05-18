package org.example;

import java.util.ArrayList;

public class Kauplus implements ToodeMuuk{

    private ArrayList<Toode> tooded;

    public ArrayList<Toode> getTooded() {
        return tooded;
    }

    // Constructor
    public Kauplus() {
        tooded = new ArrayList<>();
    }

    // veini lisamine poodi
    public void addToode(Toode toode) {
        tooded.add(toode);
    }

    // müümine
    public void sellToode(Toode toode) {
        if (tooded.contains(toode)) {
            tooded.remove(toode);
            System.out.println("Müüdud: " + toode.toString());
        } else {
            System.out.println("Toode pole leidnud poes");
        }
    }

    // veini printimine
    public void printTooded() {
        for (Toode toode : tooded) {
            System.out.println(toode.toString());
        }
    }

    public static void main(String[] args) {
        Kauplus kauplus = new Kauplus();

        TSark toode1 = new TSark("basic white", 10, "M");
        TSark toode2 = new TSark("grey", 11, "S");
        Sark toode3 = new Sark("black", 20, "L");
        Sark toode4 = new Sark("pink", 25, "M");

        kauplus.addToode(toode1);
        kauplus.addToode(toode2);
        kauplus.addToode(toode3);
        kauplus.addToode(toode4);

        System.out.println("Tooded:");
        kauplus.printTooded();

        System.out.println("Toimub müük...");
        kauplus.sellToode(toode1);
        kauplus.sellToode(toode3);

        System.out.println("Tooded müügis");
        kauplus.printTooded();
    }

    @Override
    public void muuToode(Toode toode) {

    }
}

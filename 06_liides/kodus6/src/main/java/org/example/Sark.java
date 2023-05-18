package org.example;

public class Sark extends Toode {

    private String suurus;

    public Sark(String name, double price, String suurus) {
        super(name, price, suurus);
        this.suurus = suurus;
    }

    public String getSuurus() {
        return suurus;
    }

    public void setSuurus(String suurus) {
        this.suurus = suurus;
    }

    @Override
    public String toString() {
        return super.toString() + " " + suurus;
    }
}

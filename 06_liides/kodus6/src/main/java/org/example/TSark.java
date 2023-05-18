package org.example;

public class TSark extends Toode {

    private String suurus;

    public TSark(String name, double price, String suurus) {
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

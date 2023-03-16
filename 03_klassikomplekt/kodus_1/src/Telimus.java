public class Telimus {
    roog roog;
    String lauanumber;
    int mitu;

    public Telimus(roog roog, String lauanumber, int mitu) {
        this.roog = roog;
        this.lauanumber = lauanumber;
        this.mitu = mitu;
    }

    public void mituTehingut() {
        System.out.println("Kokku oli tehtud: " + this.mitu + " tehingut");
    }

    public void rooguKogus() {
        System.out.println("Oli telitud: " + roog.nimetus);
    }
}
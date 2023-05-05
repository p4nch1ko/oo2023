import java.util.Date;

public class Klient {
    Tellimus tellimus;
    int lauaNumber;
    Date telimuseAeg;
    boolean aktiivne;
    Date kustutatud;

    public Klient(int lauaNumber) {
        this.lauaNumber = lauaNumber;
        this.telimuseAeg = new Date();
        this.aktiivne = true;
        this.kustutatud = null;
    }

    public String kustutaTellimus(){
        this.aktiivne = false;
        this.kustutatud = new Date();
        return "Tellimus oli kustutatud!";
    }
}


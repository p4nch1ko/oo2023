public class IsikukoodSW extends Isikukood implements Andmed {

    public IsikukoodSW(String nimi, String isikukood){
        super(nimi, isikukood);
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
// YYMMDD-XXXX
// 811228-9874
// 670919-9530
// 212121-2127
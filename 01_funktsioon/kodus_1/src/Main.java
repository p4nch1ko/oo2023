public class Main {
    public static void main(String[] args) {
        Telimus telimus1 = new Telimus(new roog("pearoog", "kana nuudlid", 3), "2", 2);
        Telimus telimus2 = new Telimus(new roog("desert", "vanilli juustukook", 2), "4", 1);

        telimus1.mituTehingut();
        telimus2.rooguKogus();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IsikukoodEE ee1 = new IsikukoodEE("Mihkel","50001029996");
        System.out.println(ee1.getSugu());
        System.out.println(ee1.getKuupäev());
        System.out.println(ee1.getVanus());
        IsikukoodEE ee2 = new IsikukoodEE("Mihkel","70303039914");
        System.out.println(ee2.getSugu());
        System.out.println(ee2.getKuupäev());
        System.out.println(ee2.getVanus());
        IsikukoodEE ee3 = new IsikukoodEE("Mihkel","30303039816");
        System.out.println(ee3.getSugu());
        System.out.println(ee3.getKuupäev());
        System.out.println(ee3.getVanus());
        IsikukoodEE ee4 = new IsikukoodEE("Mihkel","50701019992");
        System.out.println(ee4.getSugu());
        System.out.println(ee4.getKuupäev());
        System.out.println(ee4.getVanus());
        IsikukoodEE ee5 = new IsikukoodEE("Mihkel","40404049996");
        System.out.println(ee5.getSugu());
        System.out.println(ee5.getKuupäev());
        System.out.println(ee5.getVanus());

        IsikukoodFI fi1 = new IsikukoodFI("Mihkel", "111111-111C");
        System.out.println(fi1.getSugu());
        System.out.println(fi1.getKuupäev());
        IsikukoodFI fi2 = new IsikukoodFI("Mihkel", "010101-0101");
        System.out.println(fi2.getSugu());
        System.out.println(fi2.getKuupäev());
        IsikukoodFI fi3 = new IsikukoodFI("Mihkel", "010101A900R");
        System.out.println(fi3.getSugu());
        System.out.println(fi3.getKuupäev());
        IsikukoodFI fi4 = new IsikukoodFI("Mihkel", "010101-0102");
        System.out.println(fi4.getSugu());
        System.out.println(fi4.getKuupäev());
        IsikukoodFI fi5 = new IsikukoodFI("Mihkel", "111111-111Q");
        System.out.println(fi5.getSugu());
        System.out.println(fi5.getKuupäev());
    }
}
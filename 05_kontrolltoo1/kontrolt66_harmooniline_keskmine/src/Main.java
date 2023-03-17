public class Main {

    public static void main(String[] args) {
        System.out.println(keskmineKiirus(30, 60));
    }

    public static double keskmineKiirus(double kiirus1, double kiirus2) {
        double keskmineKiirus = (2*kiirus1*kiirus2)/(kiirus1+kiirus2);
        System.out.println("keskmine kiirus oli " + keskmineKiirus);
        return keskmineKiirus;
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mass(kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Pikkus(m): ");
        double height = scanner.nextDouble();

        System.out.print("Vanus: ");
        int age = (int) scanner.nextDouble();

        System.out.print("Südame löögisagedus: ");
        double heartRate = scanner.nextDouble();

        System.out.print("Mittu liitrit vett joote päeva jooksul: ");
        double waterIntake = scanner.nextDouble();
        double recommendedWaterIntake = 1.5 ;

        double bmi = calculateBMI(weight, height);
        boolean isOverweight = isOverweight(weight, height);
        int heartBeat = calculateRestingHeartRate(age);
        boolean heartRateTooHigh = isHeartRateTooHigh(heartRate, age);
        double waterRate = calculateWaterIntake(age);
        boolean waterAverage = isDrinkingEnoughWater(waterIntake, recommendedWaterIntake);


        System.out.println("Kehamassiindeks: " + bmi);
        System.out.println("Kas ülekaaluline: " + isOverweight);
        System.out.println("Südame löögisagedus puhkeolekus: " + heartBeat);
        System.out.println("Liiga kõrge südame löögisagedus: " + heartRateTooHigh);
        System.out.println("Päeva vee vajadus: " + waterRate);
        System.out.println("Joob piisavalt vett: " + waterAverage);
    }

    // 1: arvutab kehamassiindeksi
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // 2: kontrollib, kas inimene on ülekaaluline
    public static boolean isOverweight(double weight, double height) {
        double bmi = calculateBMI(weight, height);
        return bmi >= 25;
    }

    // 3: arvutab südame löögisageduse puhkeolekus
    public static int calculateRestingHeartRate(int age) {
        return 60 + (int) ((220 - age) * 0.7);
    }

    // 4: kontrollib, kas südame löögisagedus on liiga kõrge
    public static boolean isHeartRateTooHigh(double heartRate, int age) {
        int maxHeartRate = 220 - age;
        return heartRate > maxHeartRate * 0.8;
    }

    // 5: arvutab päevase veevajaduse
    public static double calculateWaterIntake(double weight) {
        return weight * 0.033;
    }

    // 6: kontrollib, kas inimene joob piisavalt vett
    public static boolean isDrinkingEnoughWater(double waterIntake, double recommendedWaterIntake) {
        return waterIntake >= recommendedWaterIntake;
    }
    //public static void main(String[] args) {
  //      System.out.println("Hello world!");
 //   }
}
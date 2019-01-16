package modul1.lesson3.homeWork;

public class Zadacha5 {
    public static void main(String[] args) {
        int cash = 10000;
        double procent = 0.09;
        double sroc = 7;

        double dohod = cash * Math.pow((1 + procent), sroc);
        System.out.printf("%.2f", dohod);

    }
}

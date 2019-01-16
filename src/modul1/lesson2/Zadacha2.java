package modul1.lesson2;

public class Zadacha2 {
    public static void main(String[] args) {
        int tour = 1000;
        // int zarplata = 200;
        int rest = 100;
        int month = 5;

        boolean turBuy = tour < (rest * month) && tour < 2000;
        //System.out.println(turBuy);

        if (turBuy == true) {
            System.out.println("tur cupim");
        } else {
            System.out.println("ne cupim");
        }
    }
}

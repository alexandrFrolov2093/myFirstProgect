package modul1.lesson3.homeWork;

public class Zadacha2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0 && i % 4 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}

package modul1.lesson4.homeWork;

public class Zadacha2 {
    public static void main(String[] args) {
        int[] massiv = {1, 1, 1, 1, 1, 1, 1};
        int summa = 0;

        for (int i = 0; i < massiv.length; i++) {
            summa += massiv[i];
        }

        System.out.println(summa);
    }
}

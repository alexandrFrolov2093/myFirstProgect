package modul1.lesson4.homeWork;

public class Zadacha4 {
    public static void main(String[] args) {
        int[] massiv = new int[7];

        for (int i = 1, index = 0; index < massiv.length; i++) {
            if (i % 4 == 0) {
                massiv[index] = i;
                System.out.println(massiv[index]);
                index++;
            }
        }
    }
}

package modul2.homeWork;

public class Zadacha1 {
    public static void main(String[] args) {
        int[] mass = {3, 2, 1, 2, 3};
        int min = mass[0];
        int summ = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
                count = i;
            }

        }

        for (int i = count; i < mass.length; i++, count++) {

            summ += mass[count];
        }

        System.out.println(summ);
    }
}

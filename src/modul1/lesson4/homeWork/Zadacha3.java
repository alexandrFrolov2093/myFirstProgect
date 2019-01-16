package modul1.lesson4.homeWork;

public class Zadacha3 {
    public static void main(String[] args) {
        int[] massivOne = {4, 6, 8, 3, 9};
        int[] massivTwo = new int[massivOne.length];

        for (int i = 0; i < massivOne.length; i++) {
            if (i == massivOne.length - 1) {
                massivTwo[i] = massivOne[0];
            } else {
                massivTwo[i] = massivOne[i + 1];
            }
            System.out.println(massivTwo[i]);
        }


    }
}

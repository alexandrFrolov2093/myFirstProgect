package modul1.lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        int index = 0;

        for (int i = 0; i <= 50; i++) {
            if (index == 10) {
                break;
            }
            if (i % 2 == 0) {
                massiv[index] = i;
                index++;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(massiv[i]);
        }
    }
}



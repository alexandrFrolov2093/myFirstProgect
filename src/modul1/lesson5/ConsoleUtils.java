package modul1.lesson5;

import java.util.Scanner;

public class ConsoleUtils {
    public static void printPrivetByNumber() {
        System.out.println("vvedite chislo : ");

        //создание объекта:
        //int[] mass = new int[5];
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("privet");
        }
    }
}

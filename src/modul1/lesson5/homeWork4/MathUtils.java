package modul1.lesson5.homeWork4;

import java.util.Scanner;

public class MathUtils {

    //Площадь треугольника
    public static double plashadTreugolnika(double a, double b, double c) {
        double poluP = (a + b + c) / 2;
        double plashad = Math.sqrt(poluP * (poluP - a) * (poluP - b) * (poluP - c));
        return plashad;
    }

    //Вывести четные числа массива
    public static void massiv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива ");
        int razmer = scanner.nextInt();
        int[] massiv = new int[razmer];
        System.out.println("Введите элементы массива ");

        for (int i = 0; i < razmer; i++) {
            massiv[i] = scanner.nextInt();
        }
        System.out.println("Четные числа массива:");
        for (int i = 0; i < razmer; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.println(massiv[i]);
            }
        }
    }

    //Посчитать сумму дробей
    public static int[] summa(int[] drobi) {
        int[] result = new int[2];
        int delitel = 1;
        if (drobi[0] == drobi[2]) {
            result[0] = drobi[0] + drobi[2];
            result[1] = drobi[1];
        } else {
            result[0] = drobi[0] * drobi[3] + drobi[1] * drobi[2];
            result[1] = drobi[1] * drobi[3];
        }
        for (int i = 1; i < result[0] * result[1]; i++) {
            if (result[0] % i == 0 && result[1] % i == 0) {
                delitel = i;
            }
        }
        result[0] /= delitel;
        result[1] /= delitel;

        return result;
    }
}


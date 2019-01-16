package modul1.lesson5.homeWork4;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Площадь треугольника
        System.out.println("Введите стороны треугольника");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double plashad = MathUtils.plashadTreugolnika(a, b, c);
        System.out.printf("Площадь треугольника = %.2f%n", plashad);

        //Вывести четные числа массива
        MathUtils.massiv();

        //Посчитать сумму дробей
        int[] drobi = new int[4];
        System.out.println("Ведите чилитель");
        int chis1 = scanner.nextInt();
        drobi[0] = chis1;
        System.out.println("Ведите знаменатель");
        int znam1 = scanner.nextInt();
        drobi[1] = znam1;
        System.out.println("Ведите чилитель");
        int chis2 = scanner.nextInt();
        drobi[2] = chis2;
        System.out.println("Ведите знаменатель");
        int znam2 = scanner.nextInt();
        drobi[3] = znam2;
        int cel = 0;


        int[] summa = MathUtils.summa(drobi);
        if (summa[0] > summa[1]) {
            cel = summa[0] / summa[1];
            summa[0] = summa[0] % summa[1];
            System.out.println("Ответ = " + cel + " " + summa[0] + "/" + summa[1]);
        } else if (summa[0] == summa[1])
            System.out.println("Ответ 1");
        else
            System.out.println("Ответ = " + summa[0] + "/" + summa[1]);
    }
}

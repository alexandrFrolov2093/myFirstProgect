package modul1.lesson6;

import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][5];
        int number = 7;
        int[][] rezult = MatrixUtils.zapolnenie(matrix, number);
        MatrixUtils.print(rezult);
        MatrixUtils.printDiagonal(rezult);
        int i = 2;
        int j = 3;
        int znach = MatrixUtils.getZnach(rezult, i, j);
        System.out.println(znach);
        int summ = MatrixUtils.summa(rezult);
        System.out.println(summ);

        System.out.println(MatrixUtils.nool(rezult));
        int[][] edinich = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(MatrixUtils.nool(edinich));


    }
}

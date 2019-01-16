package modul1.lesson6;

public class MatrixUtils {
    public static int[][] zapolnenie(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number;
            }
        }
        return matrix;
    }

    public static void print(int[][] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printDiagonal(int[][] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                if (i == j)
                    System.out.print(massiv[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static int getZnach(int[][] mass, int i, int j) {
        return mass[i][j];
    }

    public static int summa(int[][] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
            }
        }
        return sum;
    }

    public static boolean nool (int[][] massiv){
        boolean rezult = false;
        int colvoOne = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                if (i == j && massiv[i][j] == 1) {
                    colvoOne++;
                } else if (massiv[i][j] != 0) {
                    rezult = false;
                }
            }
            if (colvoOne == massiv.length) {
                rezult = true;
            }
        }
        return rezult;
    }
}

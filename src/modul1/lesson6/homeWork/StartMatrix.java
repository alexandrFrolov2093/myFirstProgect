package modul1.lesson6.homeWork;

public class StartMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        System.out.println("кол-во строк" + MatrixUtils.getRows(matrix));
        System.out.println("кол-во стобцов" + MatrixUtils.getColumns(matrix));

        int[][] neSquareMatrix = new int[3][5];
        System.out.println("квадратная матрица + " + MatrixUtils.isSquareMatrix(matrix));
        System.out.println("квадратная матрица - " + MatrixUtils.isSquareMatrix(neSquareMatrix));

        MatrixUtils.setValueAt(2, 3, 5, neSquareMatrix);

        int[][] matrix2 = {{2, 3, 4}, {5, 6, 7}, {8, 9, 0}};
        double umnog = 3;
        int[][] rezult = MatrixUtils.mul(umnog, matrix2);
        MatrixUtils.printMatrix(rezult);

        int[][] nullMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println("нулевая матрица + " + MatrixUtils.isNullMatrix(nullMatrix));
        System.out.println("нулевая матрица - " + MatrixUtils.isNullMatrix(matrix2));

        int[][] edinich = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println("единичная матрица - " + MatrixUtils.isIdentityMatrix(matrix2));
        System.out.println("единичная матрица + " + MatrixUtils.isIdentityMatrix(edinich));

        int[][] transposeMatrix = {{1, 2, 3}, {4, 5, 6}};
        MatrixUtils.printMatrix(transposeMatrix);
        MatrixUtils.printMatrix(MatrixUtils.transpose(transposeMatrix));
    }
}

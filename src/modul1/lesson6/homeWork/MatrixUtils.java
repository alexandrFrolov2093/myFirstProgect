package modul1.lesson6.homeWork;

public class MatrixUtils {
    /**
     * Возвращает количество строк матрицы
     *
     * @return количесвто строк матрицы
     */
    public static int getRows(int[][] matrix) {
        return matrix.length;
    }

    /**
     * Возвращает количество столбцов матрицы
     *
     * @return количество столбцов матрицы
     */
    public static int getColumns(int[][] matrix) {
        return matrix[0].length;
    }

    /**
     * Проверяет является ли текущая матрица квадратной. <br/>
     * Т.е. матрица у которой количество строк равно количеству столбцов<br/>
     *
     * @return <b>true</b> если текущая матрица квадратная
     */
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix.length == matrix[0].length)
            return true;
        else
            return false;
    }


    /**
     * Устанавливает элемент матрицы по индексам
     *
     * @param rowIndex индекс строки
     * @param colIndex индекс столбца
     * @param value    новое значение элемента
     *                 или индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы
     */
    public static void setValueAt(int rowIndex, int colIndex, double value, int[][] matrix) {
        matrix[rowIndex][colIndex] = (int) value;
        MatrixUtils.printMatrix(matrix);
    }

    /**
     * Возвращает произведение текущей матрицы на число.<br/>
     * <b><i>(Результат операции - новый двухмерный массив) </i></b>
     *
     * @param value число на которое нужно умножить всю матрицу
     * @return произведение <b><i>(новый двухмерный массив)</i></b>
     */
    public static int[][] mul(double value, int[][] matrix) {
        int[][] umnogennayMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                umnogennayMatrix[i][j] = (int) (matrix[i][j] * value);
            }
        }
        return umnogennayMatrix;
    }

    /**
     * Проверяет является ли текущая матрица нулевой<br/>
     * Нулевая матрица - матрица у которой все элементы - 0:
     *
     * @return <b>true</b> если текущая матрица нулевая
     */
    public static boolean isNullMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * !!!!!!!!!!!!!! дополнительное задание!!!!!!!!!!!!!!!!
     * Проверяет является ли текущая матрица единичной<br/>
     * Единичная матрица - матрица у которой на главной диагонали единицы, а остальные элементы - 0:
     *
     * @return <b>true</b> если текущая матрица единичная
     */
    public static boolean isIdentityMatrix(int[][] matrix) {
        boolean rezult = false;
        int colvoOne = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] == 1) {
                    colvoOne++;
                } else if (matrix[i][j] != 0) {
                    rezult = false;
                }
            }
            if (colvoOne == matrix.length) {
                rezult = true;
            }
        }
        return rezult;
    }


    /**
     * !!!!!!!!!!!!!! дополнительное задание!!!!!!!!!!!!!!!!
     * Возвращает транспонированную матрицу по отношению к текущей
     *
     * @return транспонированная матрица по отношению к текущей
     */
    public static int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}

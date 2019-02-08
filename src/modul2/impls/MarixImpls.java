package modul2.impls;

import modul2.interfaces.IMatrix;


public class MarixImpls implements IMatrix {
    private double[][] matrix;

    public MarixImpls() {

    }

    public MarixImpls(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return this.matrix.length;
    }

    @Override
    public int getColumns() {
        return this.matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= matrix.length || colIndex < 0 || colIndex >= matrix[0].length)
            throw new IndexOutOfBoundsException("rowIndex <0 || rowIndex >= matrix.length || colIndex < 0 || colIndex >= matrix[0].length");
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= matrix.length || colIndex < 0 || colIndex >= matrix[0].length)
            throw new IndexOutOfBoundsException("rowIndex <0 || rowIndex >= matrix.length || colIndex < 0 || colIndex >= matrix[0].length");
        this.matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.matrix == null || otherMatrix == null)
            throw new NullPointerException("this.matrix == null || otherMatrix == null");
        if (this.matrix.length != otherMatrix.getRows() && this.matrix[0].length != otherMatrix.getColumns())
            throw new IllegalArgumentException("this.matrix.length != otherMatrix.getRows() && this.matrix[0].length != otherMatrix.getColumns()");
        double[][] mat = new double[this.matrix.length][this.matrix[0].length];
        MarixImpls result = new MarixImpls(mat);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result.setValueAt(i, j, this.matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        result.printToConsole();
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.matrix == null || otherMatrix == null)
            throw new NullPointerException("this.matrix == null || otherMatrix == null");
        if (this.matrix.length != otherMatrix.getRows() && this.matrix[0].length != otherMatrix.getColumns())
            throw new IllegalArgumentException("this.matrix.length != otherMatrix.getRows() && this.matrix[0].length != otherMatrix.getColumns()");
        double[][] mat = new double[this.matrix.length][this.matrix[0].length];
        MarixImpls result = new MarixImpls(mat);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result.setValueAt(i, j, this.matrix[i][j] - otherMatrix.getValueAt(i, j));
            }
        }
        result.printToConsole();
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.matrix == null || otherMatrix == null)
            throw new NullPointerException("this.matrix == null || otherMatrix == null");
        if (this.matrix[0].length != otherMatrix.getRows())
            throw new IllegalArgumentException("this.matrix[0].length != otherMatrix.getRows()");
        int m = this.matrix.length;
        int n = otherMatrix.getColumns();
        int o = otherMatrix.getRows();
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += this.matrix[i][k] * otherMatrix.getValueAt(k, j);
                }
            }
        }
        MarixImpls result = new MarixImpls(res);
        result.printToConsole();
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        double[][] mat = new double[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mat[i][j] = this.matrix[i][j] * value;
            }
        }
        MarixImpls result = new MarixImpls(mat);
        result.printToConsole();
        return result;
    }

    @Override
    public IMatrix transpose() {
        double[][] mat = new double[this.matrix[0].length][this.matrix.length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mat[j][i] = this.matrix[i][j];
            }
        }
        MarixImpls result = new MarixImpls(mat);
        result.printToConsole();
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    count++;
            }
        }
        if (count != 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isIdentityMatrix() {
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

    @Override
    public boolean isSquareMatrix() {
        if (this.matrix.length == this.matrix[0].length)
            return true;
        else
            return false;
    }

    @Override
    public void printToConsole() {
        System.out.println("матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

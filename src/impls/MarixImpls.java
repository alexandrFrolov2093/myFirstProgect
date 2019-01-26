package impls;

import interfaces.IMatrix;


public class MarixImpls implements IMatrix {
    private double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

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
            return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

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
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}

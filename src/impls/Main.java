package impls;

public class Main {
    public static void main(String[] args) {
        StringUtilImpls stringUtilImpls = new StringUtilImpls();
        System.out.println(stringUtilImpls.div("81","9"));

        int[] mass = stringUtilImpls.findWord("qwertyqwe","qwe");
        System.out.println("indexs");
        for(int num:mass){
            System.out.println(num);
        }
        System.out.println("------------");

        FractionNumbersImpls a = new FractionNumbersImpls();
        a.setDividend(3);
        a.setDivisor(4);
        System.out.println("drob");
        System.out.println(a.value());
        System.out.println(a.toString());
        FractionNumbersImpls b = new FractionNumbersImpls();
        b.setDivisor(2);
        b.setDividend(1);
        System.out.println("-------------");

        FractionNumbersOperationImpls fractionNumbersOperationImpls = new FractionNumbersOperationImpls();
        System.out.println(fractionNumbersOperationImpls.add(a,b));
        System.out.println(fractionNumbersOperationImpls.div(a,b));
        System.out.println(fractionNumbersOperationImpls.mul(a,b));
        System.out.println(fractionNumbersOperationImpls.sub(a,b));

        System.out.println("-------------------");
        double[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] matrix2 = {{3,2,1},{6,5,4},{9,8,7}};
        double[][] nullMatrix = {{0,0,0},{0,0,0},{0,0,0}};
        double[][] edinichMatrix = {{1,0,0},{0,1,0},{0,0,1}};

        MarixImpls matrixA = new MarixImpls(matrix);
        MarixImpls matrixB = new MarixImpls(matrix2);
        MarixImpls matrixNull = new MarixImpls(nullMatrix);
        MarixImpls edinichMatr = new MarixImpls(edinichMatrix);
        matrixA.sub(matrixB);
        matrixA.mul(matrixB);
        matrixA.add(matrixB);
        matrixA.mul(10);
        matrixA.fillMatrix(10);
        System.out.println(matrixB.getColumns());
        matrixB.setValueAt(1,1,1);
        System.out.println(matrixB.getRows());
        System.out.println(matrixB.getValueAt(2,2));
        System.out.println(edinichMatr.isIdentityMatrix());
        System.out.println(edinichMatr.isSquareMatrix());
        System.out.println(matrixNull.isNullMatrix());






    }
}

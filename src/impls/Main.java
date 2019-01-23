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



    }
}

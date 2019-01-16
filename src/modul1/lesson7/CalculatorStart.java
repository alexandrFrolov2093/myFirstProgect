package modul1.lesson7;

public class CalculatorStart {
    public static void main(String[] args) {

        int chislo1 = Calculator.getInt();
        char operator = Calculator.getOpiration();
        int chislo2 = Calculator.getInt();

        System.out.println("rezult = " + Calculator.operation(chislo1, chislo2, operator));
    }
}

package modul1.lesson7;

import java.util.Scanner;

public class Calculator {

    public static int getInt() {

        System.out.println("vvedite chislo");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] inputNumberToChar = inputNumber.toCharArray();
        for (int i = 0; i < inputNumberToChar.length; i++) {
            char currentChar = inputNumberToChar[i];
            if (currentChar != '0' && currentChar != '1' && currentChar != '2' && currentChar != '3' && currentChar != '4'
                    && currentChar != '5' && currentChar != '6' && currentChar != '7' && currentChar != '8'
                    && currentChar != '9') {
                System.out.println("ne chislo! povtorite vvod");
                return Calculator.getInt();
            }
        }
        int chislo1 = Integer.parseInt(inputNumber);
        return chislo1;
    }

    public static char getOpiration() {
        System.out.println("vvedite deystvie");
        Scanner scanner = new Scanner(System.in);
        String inputOperation = scanner.nextLine();
        char[] inputOperationToChar = inputOperation.toCharArray();
        char currentChar = inputOperationToChar[0];
        if (currentChar != '+' && currentChar != '-' && currentChar != '*' && currentChar != '/' && inputOperationToChar.length != 0) {
            System.out.println("ne operation! povtorite vvod");
            return Calculator.getOpiration();
        }
        return currentChar;
    }

    public static double operation(int chislo1, int chislo2, char operator) {
        if (operator == '*')
        return chislo1 * chislo2;
        if (operator == '/')
        return chislo1 / chislo2;
        if (operator == '+')
            return chislo1 + chislo2;
        return chislo1 - chislo2;
    }
}

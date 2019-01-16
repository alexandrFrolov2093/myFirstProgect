package homeWork;

public class Zadacha2 {
    public static void main(String[] args) {
        String string = "asdfg12ew23et5";
        char[] charString = string.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] == '1' || charString[i] == '2' || charString[i] == '3' || charString[i] == '4' || charString[i] == '5' ||
                    charString[i] == '0' || charString[i] == '9' || charString[i] == '8' || charString[i] == '7' || charString[i] == '6')
                System.out.print(charString[i]);
        }
        System.out.println();
        for (int i = 0; i < charString.length; i++) {
            if (charString[i] != '1' && charString[i] != '2' && charString[i] != '3' && charString[i] != '4' && charString[i] != '5' &&
                    charString[i] != '0' && charString[i] != '9' && charString[i] != '8' && charString[i] != '7' && charString[i] != '6')
                System.out.print(charString[i]);
        }
    }
}

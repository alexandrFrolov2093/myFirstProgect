package modul2.impls;

import modul2.interfaces.CustomException;
import modul2.interfaces.StringUtils;

import java.util.ArrayList;

public class StringUtilImpls implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null!");
        }
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            if (num2 == 0) {
                throw new ArithmeticException("ne moget byt 0");
            }
            return num1 / num2;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("ne chislo!");
        }

    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null)
            throw new NumberFormatException("text == null || word == null");
        int index = 0;
        int colvoSlov = 0;

        int lastPos = -1;
        while (true) {
            lastPos = text.indexOf(word, lastPos + 1);
            if (lastPos < 0)
                break;
            ++colvoSlov;
        }
        int lastPos2 = -1;
        int[] mass = new int[colvoSlov];
        while (true) {
            lastPos2 = text.indexOf(word, lastPos2 + 1);
            if (lastPos2 < 0)
                break;
            mass[index] = lastPos2;
            index++;
        }
        return mass;

    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        int cont = 0;
        char[] textToChar = text.toCharArray();
        for(char ch:text.toCharArray()){
            if (Character.isDigit(ch) == true)
                cont++;
        }
        if(cont == 0)
            throw new CustomException("net chisel v dtroke");
        ArrayList arrayList = new ArrayList();
        ArrayList massNum = new ArrayList();
        int lastPos = -1;
        while (true) {
            lastPos = text.indexOf(".", lastPos + 1);
            if (lastPos < 0)
                break;
            for (int index = lastPos; true;index--){
                if(Character.isDigit(textToChar[index]) == true)
                    massNum.set(0,textToChar[index]);
                else break;
            }
            massNum.add('.');
            for (int index1 = lastPos; true;index1--){
                if(Character.isDigit(textToChar[index1]) == true)
                    massNum.add(textToChar[index1]);
                else break;
            }
            massNum.add(' ');
        }
        return new double[0];
    }
}



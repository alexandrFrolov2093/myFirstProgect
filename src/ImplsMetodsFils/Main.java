package ImplsMetodsFils;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        IOUtilsImpls ioUtilsImpls = new IOUtilsImpls();
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
           out = new BufferedWriter(new FileWriter("data1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ioUtilsImpls.replaceChars(in, out, "qwerty", "QWERTY");
    }
}

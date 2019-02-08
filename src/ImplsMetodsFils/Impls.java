package ImplsMetodsFils;

import interfaceFile.FileCopyFailedException;

public class Impls {
    public static void main(String[] args) {
        FileCopyUtilsWithOneBayt fileCopyUtilsWithOneBayt = new FileCopyUtilsWithOneBayt();
        try {
            fileCopyUtilsWithOneBayt.copyFile("C:\\Windows.old\\Users\\sanyfrol\\Pictures\\qqqqq.jpg", "C:\\Users\\Sanya\\Pictures\\Saved Pictures\\iii.jpg");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        IOUtilsImpls ioUtilsImpls = new IOUtilsImpls();
        String[] m = ioUtilsImpls.findFiles("C:\\Users\\Sanya\\Desktop");
        for (String s:m) {
            System.out.println(s);
        }
    }
}

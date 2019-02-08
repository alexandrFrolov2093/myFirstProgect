package lesson20;

import java.io.File;
import java.io.FileFilter;

public class Main3 {
    public static void main(String[] args) {
        File diskC = new File("C:\\Users\\Sanya\\Documents");
        File[] files = diskC.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.isFile();
            }
        });
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}

package modul1.lesson7.homeWork;

import java.util.Scanner;

public class StringStart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(StringUtils.reverse(text));
        System.out.println(StringUtils.countGlass(text));
        System.out.println(StringUtils.countSoglasnie(text));
    }
}

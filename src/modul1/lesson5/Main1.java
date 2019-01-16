package modul1.lesson5;

public class Main1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
// из дз 5 номер
package modul1.lesson4;

public class Main1 {
    public static void main(String[] args) {
        double cash = 10000;
        double procent = 9;
        double srok = 7;

        for (int i = 0; i < srok; i++){
            cash = cash + (cash/100*procent);
        }
        System.out.println(cash);
    }
}

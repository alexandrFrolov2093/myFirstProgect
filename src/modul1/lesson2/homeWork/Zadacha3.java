package modul1.lesson2.homeWork;

public class Zadacha3 {
    public static void main(String[] args) {
        double storona1 = 3;
        double storona2 = 7;
        double storona3 = 5;

        double poluP = (storona1 + storona2 + storona3) / 2;
        double plashad = Math.sqrt(poluP * (poluP - storona1) * (poluP - storona2) * (poluP - storona3));

        System.out.println(plashad);
    }
}

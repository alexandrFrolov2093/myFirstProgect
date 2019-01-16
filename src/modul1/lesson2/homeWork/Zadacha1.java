package modul1.lesson2.homeWork;

public class Zadacha1 {
    public static void main(String[] args) {
        double storona1 = 10;
        double storona2 = 1;
        double storona3 = 15;

        if ((storona1 == storona2 || storona1 == storona3 || storona2 == storona3) &&
                (storona1 != storona2 || storona1 != storona3 || storona2 != storona3)) {
            System.out.println("Равнобедренный");
        }
        if (storona1 == storona2 && storona1 == storona3 && storona2 == storona3) {
            System.out.println("Равносторонний");
        }
        if (storona1 != storona2 && storona1 != storona3 && storona2 != storona3) {
            System.out.println("Разносторонний");
        }
    }
}

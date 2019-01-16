package lesson12.magazin;

public class Filtr {

    public static void printChipestTovar(Tovar tovar1, Tovar tovar2) {
        if (tovar1.getPrice() > tovar2.getPrice())
            System.out.println(tovar2.toString());
        else System.out.println(tovar1.toString());
    }
}

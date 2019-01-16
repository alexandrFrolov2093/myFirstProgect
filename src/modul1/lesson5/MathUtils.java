package modul1.lesson5;

public class MathUtils {

    //metod
    public static int summa(int chislo1, int chislo2) {
        int summ = chislo1 + chislo2;
        return summ;
    }
    // модификатор доступа + статичность + возвращаемый тип (void) + название (входные данные) {};

    public static int znamenatel(int znam1, int znam2) {
        for (int i = 1; i <= znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                return i;
            }
        }
        return znam1 * znam2;
    }
}

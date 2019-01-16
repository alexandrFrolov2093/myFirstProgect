package modul1.lesson2.homeWork;

public class Zadacha2 {
    public static void main(String[] args) {
        double shirinaYashica = 20;
        double dlinnaYashica = 20;
        double visotaYashica = 20;

        double shirinaKubica = 2;
        double dlinnaKubica = 2;
        double visotaKubica = 5;

        double obyomYashica = shirinaYashica * dlinnaYashica * visotaYashica;
        double obyomKubica = shirinaKubica * dlinnaKubica * visotaKubica;

        int countKubicovInYashic = (int) (obyomYashica / obyomKubica);
        System.out.println(countKubicovInYashic);
    }
}

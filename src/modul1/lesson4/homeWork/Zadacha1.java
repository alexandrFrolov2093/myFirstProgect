package modul1.lesson4.homeWork;

public class Zadacha1 {
    public static void main(String[] args) {
        char[] glasn = {'а', 'А', 'е', 'Е', 'ё', 'Ё', 'и', 'И', 'о', 'О', 'у', 'У', 'ы', 'Ы', 'э', 'Э',
                'ю', 'Ю', 'я', 'Я', 'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A'};
        char[] bukvy = {'а', 'u', 'л', 'ы', 'о', 'к', 'т', 'ь', 'ч', 'я'};
        int kolvo = 0;

        for (int i = 0; i < bukvy.length; i++) {
            for (int k = 0; k < glasn.length; k++) {
                if (bukvy[i] == glasn[k]) {
                    kolvo++;
                    break;
                }
            }
        }
        System.out.println(kolvo);
    }
}

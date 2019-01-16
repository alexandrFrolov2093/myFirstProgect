package modul1.lesson3.homeWork;

public class Zadacha4 {
    public static void main(String[] args) {
        char[] one = {'a', 'b', 'c', 'd'};
        char[] two = {'q', 'w', 'e', 'r'};
        char[] three = new char[one.length + two.length];

        for (int i = 0; i < one.length; i++) {
            three[i] = one[i];
        }

        for (int i = three.length - two.length, index = 0; i < three.length; i++, index++) {
            three[i] = two[index];
        }

        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }
    }
}
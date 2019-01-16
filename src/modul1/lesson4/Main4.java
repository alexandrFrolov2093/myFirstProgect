package modul1.lesson4;

public class Main4 {
    public static void main(String[] args) {
        char[] one = {'a', 'b', 'c', 'd'};
        char[] two = new char[one.length];

         for (int i = one.length - 1, index = 0; i >= 0; i--, index++){
             two[index] = one[i];
             System.out.println(two[index]);
         }
    }
}

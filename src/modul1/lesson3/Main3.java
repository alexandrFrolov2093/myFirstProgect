package modul1.lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] massive = new int[7];
        // massive[0] = 7;
        // massive[1] = 6;
        // massive[2] = 5;
        // massive[3] = 4;
        // massive[4] = 3;
        // massive[5] = 2;
        // massive[6] = 1;

        for (int i = 0, k = 7; i <= 6; i++, k--) {
            massive[i] = k;
            System.out.println(massive[i]);
        }
        System.out.println(massive.length);

    }
}

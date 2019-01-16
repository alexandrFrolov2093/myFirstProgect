package modul1.lesson6;

public class Main1 {
    public static void main(String[] args) {
        int[][] massiv = {{1, 2, 7}, {5, 3, 2}, {2, 1, 3}};

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                if (i == j)
                    System.out.print(massiv[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

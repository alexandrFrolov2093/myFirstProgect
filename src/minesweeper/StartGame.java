package minesweeper;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vvod kolvo MIN");
        int chisloM = scanner.nextInt();
        System.out.println("chisloStrok");
        int chisloStrok = scanner.nextInt();
        System.out.println("chisloStolbov");
        int chisloStolbov = scanner.nextInt();
        char[][] mine = new char[chisloStrok][chisloStolbov];
        char[][] xxx = new char[chisloStrok][chisloStolbov];
        xxx = UtilsGame.XXX(chisloStrok,chisloStolbov);
        mine = UtilsGame.Pole(chisloStrok,chisloStolbov);
        UtilsGame.print(mine);
        mine = UtilsGame.RandomForMinesweeper(chisloM, mine);
        UtilsGame.print(mine);
        mine = UtilsGame.getAnswerGrid(mine);
        UtilsGame.print(mine);
        UtilsGame.print(xxx);
        UtilsGame.game(mine, xxx);



    }
}

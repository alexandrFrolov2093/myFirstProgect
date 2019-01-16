package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class UtilsGame {

    public static char[][] getAnswerGrid(char[][] mine) {
        int count = 0;
        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[i].length; j++) {
                if (mine[i][j] == '*') {
                    mine[i][j] = 'M';
                } else {
                    if (j == 0 && i != 0 && i != mine.length - 1) {
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;
                        if (mine[i + 1][j + 1] == 'M' || mine[i + 1][j + 1] == '*')
                            count++;
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                        if (mine[i - 1][j + 1] == 'M' || mine[i - 1][j + 1] == '*')
                            count++;


                    } else if (i == 0 && j != 0 && j != mine.length - 1) {
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                        if (mine[i + 1][j + 1] == 'M' || mine[i + 1][j + 1] == '*')
                            count++;
                        if (mine[i + 1][j - 1] == 'M' || mine[i + 1][j - 1] == '*')
                            count++;
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;

                    } else if (i == 0 && j == 0) {
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                        if (mine[i + 1][j + 1] == 'M' || mine[i + 1][j + 1] == '*')
                            count++;
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;
                    } else if (j == mine.length - 1 && i != mine.length - 1 && i != 0) {
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;
                        if (mine[i + 1][j - 1] == 'M' || mine[i + 1][j - 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                        if (mine[i - 1][j - 1] == 'M' || mine[i - 1][j - 1] == '*')
                            count++;
                    } else if (i == mine.length - 1 && j != mine.length - 1 && j != 0) {
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                        if (mine[i - 1][j + 1] == 'M' || mine[i - 1][j + 1] == '*')
                            count++;
                        if (mine[i - 1][j - 1] == 'M' || mine[i - 1][j - 1] == '*')
                            count++;
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                    } else if (i == mine.length - 1 && j == mine.length - 1) {
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                        if (mine[i - 1][j - 1] == 'M' || mine[i - 1][j - 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                    } else if (i == mine.length - 1 && j == 0) {
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                        if (mine[i - 1][j + 1] == 'M' || mine[i - 1][j + 1] == '*')
                            count++;
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                    } else if (j == mine.length - 1 && i == 0) {
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;
                        if (mine[i + 1][j - 1] == 'M' || mine[i + 1][j - 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                    } else {
                        if (mine[i - 1][j - 1] == 'M' || mine[i - 1][j - 1] == '*')
                            count++;
                        if (mine[i][j - 1] == 'M' || mine[i][j - 1] == '*')
                            count++;
                        if (mine[i + 1][j - 1] == 'M' || mine[i + 1][j - 1] == '*')
                            count++;
                        if (mine[i - 1][j] == 'M' || mine[i - 1][j] == '*')
                            count++;
                        if (mine[i + 1][j] == 'M' || mine[i + 1][j] == '*')
                            count++;
                        if (mine[i - 1][j + 1] == 'M' || mine[i - 1][j + 1] == '*')
                            count++;
                        if (mine[i][j + 1] == 'M' || mine[i][j + 1] == '*')
                            count++;
                        if (mine[i + 1][j + 1] == 'M' || mine[i + 1][j + 1] == '*')
                            count++;

                    }
                    mine[i][j] = Character.forDigit(count, 10);
                    count = 0;
                }
            }
        }
        return mine;
    }

    public static char[][] game(char[][] mine, char[][] xxx) {
        int count = 0;
        int countM = 0;
        for (int i = 0; i < mine.length; i++)
            for (int j = 0; j < mine[i].length; j++) {
                if (mine[i][j] != 'M') {
                    count++;
                }
            }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (true) {
            i = scanner.nextInt() - 1;
            j = scanner.nextInt() - 1;
            if (i == -1 && j == -1) {
                break;
            }
            if (i >= mine.length || j >= mine.length) {
                System.out.println("слишком большое число");
                return UtilsGame.game(mine, xxx);
            }
            if (mine[i][j] == xxx[i][j]) {
                System.out.println("уже было");
                return UtilsGame.game(mine, xxx);
            }
            if(mine[i][j] == '0'){
                for(int k = 0; k< mine.length;k ++){
                    for (int m = 0; m <mine[i].length;m++){
                        if (m == 0 && k != 0 && k != mine.length - 1) {
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];


                        } else if (k == 0 && m != 0 && m != mine.length - 1) {
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];

                        } else if (k == 0 && m == 0) {
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];

                        } else if (m == mine.length - 1 && k != mine.length - 1 && k != 0) {
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];

                        } else if (k == mine.length - 1 && m != mine.length - 1 && m != 0) {
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];

                        } else if (k == mine.length - 1 && m == mine.length - 1) {
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                        } else if (k == mine.length - 1 && j == 0) {
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];

                        } else if (m == mine.length - 1 && k == 0) {
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];

                        } else {
                            if (mine[k - 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m - 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k - 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k][m + 1] == '0')
                                xxx[k][m] = mine[k][m];
                            if (mine[k + 1][m + 1] == '0')
                                xxx[k][m] = mine[k][m];

                        }

                    }
                }
            }
            xxx[i][j] = mine[i][j];
            if (mine[i][j] == 'M') {
                System.out.println("ooops");
                UtilsGame.print(mine);
                break;
            } else
                countM++;
            if (countM == count) {
                System.out.println("You Win!!!");
                UtilsGame.print(mine);
                break;
            }


            UtilsGame.print(xxx);
        }
        return xxx;
    }

    public static char[][]  RandomForMinesweeper(int chisloM, char[][] pole){
        Random random = new Random();
        for (int i = chisloM; i > 0; i--){
            int k = random.nextInt(pole.length);
            int j = random.nextInt(pole.length);
            if (pole[k][j] == '.')
            pole[k][j] = '*';
            else return RandomForMinesweeper(i, pole);
        }

        return pole;
    }

    public static char[][] Pole (int chisloStrok, int chisloStolbov){

        char [][] pole  = new char[chisloStrok][chisloStolbov];
        for (int k = 0;k < pole.length; k++){
            for (int m = 0; m < pole[k].length; m++){
                pole[m][k] = '.';
            }
        }
        return pole;
    }
    public static char[][] XXX(int chStrok, int chStolbov){
        char[][] xxx = new char[chStrok][chStolbov];
        for (int i = 0; i < chStrok; i++) {
            for (int j = 0; j < chStolbov;j++){
                xxx[i][j] = 'X';
            }

        }
        return xxx;
    }

    public static void print(char[][] mine) {
        for (int i = 0; i < mine.length; i++) {
            for (int j = 0; j < mine[i].length; j++) {
                System.out.print(mine[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

    }
}


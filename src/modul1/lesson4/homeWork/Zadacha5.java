package modul1.lesson4.homeWork;

public class Zadacha5 {
    public static void main(String[] args) {
        int chislitelOne = 1;
        int znamenatelOne = 6;
        int chislitelTwo = 1;
        int znamenatelTwo = 8;
        int max = 0;
        int max2 = 0;

        if (znamenatelOne > znamenatelTwo) {
            max = znamenatelOne;
            max2 = znamenatelOne;
        } else {
            max = znamenatelTwo;
            max2 = znamenatelTwo;
        }

        for (int i = 2; true; i++) {
            if (max == znamenatelOne) {
                if (max2 % znamenatelTwo == 0) {
                    System.out.println(max2);
                    break;
                } else {
                    max2 = max;
                    max2 = max2 * i;
                }
            } else {
                if (max2 % znamenatelOne == 0) {
                    System.out.println(max2);
                    break;
                } else {
                    max2 = max;
                    max2 = max2 * i;
                }
            }
        }
    }
}
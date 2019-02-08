package modul2.homeWork;

public class Zadacha3 {
    public static void main(String[] args) {
        String string = "qwerty";
        char ch = 'w';
        String chToSrting = String.valueOf(ch);
        StringBuilder stringBuild = new StringBuilder(string);
        int index = stringBuild.indexOf(chToSrting);
        stringBuild.insert(index, chToSrting);
        System.out.println(stringBuild);

    }
}

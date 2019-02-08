package modul2.homeWork;

public class Zadacha4 {
    public static void main(String[] args) {
        String source, delete;
        source = "qwertyuiop";
        delete = "qwerty";
        source = source.replace(delete, "");
        System.out.println(source);
    }
}

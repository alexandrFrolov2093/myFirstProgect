package lesson11;

public class Main {
    public static void main(String[] args) {
        Tigr tigr = new Tigr();
        Monkey monkey = new Monkey();

        Animal[] zoo = new Animal[10];
        zoo[0] = tigr;
        zoo[1] = monkey;

        zoo[0].voice();
    }
}

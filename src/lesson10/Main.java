package lesson10;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Pinguin pinguin1 = new Pinguin();
        Monkey monkey1 = new Monkey();
        Pinguin pinguin2 = new Pinguin();
        Lion lion2 = new Lion();
        Monkey monkey2 = new Monkey();

        pinguin1.print();
        lion1.print();
        monkey1.print();
        pinguin2.print();
        lion2.print();
        monkey2.print();

        pinguin1.setCost(123);
        pinguin2.setCost(123);
        pinguin1.setName("ttt");
        pinguin2.setName("ttt");
        System.out.println(pinguin1.equals(pinguin2));
    }
}

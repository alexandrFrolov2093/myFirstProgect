package lesson22;

public class Vidushiy {
    public static void main(String[] args) {
        System.out.println("concert nachinaetsya");
        Buskov buskov = new Buskov();
        Mihaylov mihaylov = new Mihaylov();
        mihaylov.setDaemon(true);
        buskov.start();
        mihaylov.start();
        while (buskov.isAlive()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("koncert okonchen");
    }
}

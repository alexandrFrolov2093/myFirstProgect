package modul1.lesson1;

public class Main2 {
    public static void main(String[] args) {
        double shirroom = 5.5;
        double dlinroom = 3;
        double shirtable = 1.5;
        double dlintable = 1;

        double ploshadRoom = shirroom * dlinroom;
        double ploshadTable = shirtable * dlintable;
        int countTableInRoom = (int)(ploshadRoom / ploshadTable);
        System.out.println(countTableInRoom);
    }
}

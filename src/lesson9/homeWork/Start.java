package lesson9.homeWork;

public class Start {
    public static void main(String[] args) {
        Triangle treugolnic = new Triangle(3, 7, 5);
        treugolnic.ploshad();
        treugolnic.perimetr();
        treugolnic.print();

        Round krug = new Round(5);
        krug.plosh();
        krug.dlinnaOkr();
        krug.print();

        Rectangle pryamougolnic = new Rectangle(2, 4);
        pryamougolnic.ploshadP();
        pryamougolnic.perimetrP();
        pryamougolnic.print();
    }
}

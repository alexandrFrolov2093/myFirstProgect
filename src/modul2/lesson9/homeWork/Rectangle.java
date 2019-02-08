package modul2.lesson9.homeWork;

public class Rectangle {
    private double storona1;
    private double storona2;
    private double ploshad;
    private double perimetr;

    public Rectangle() {

    }

    public Rectangle(double a, double b) {
        storona1 = a;
        storona2 = b;
    }

    public Rectangle(double a, double b, double plosh, double perim) {
        storona1 = a;
        storona2 = b;
        ploshad = plosh;
        perimetr = perim;
    }

    public void setPloshad(double ploshad) {
        this.ploshad = ploshad;
    }

    public double getPloshad() {
        return ploshad;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setStorona2(double storona2) {
        this.storona2 = storona2;
    }

    public double getStorona2() {
        return storona2;
    }

    public void setStorona1(double storona1) {
        this.storona1 = storona1;
    }

    public double getStorona1() {
        return storona1;
    }

    public double ploshadP() {
        double plosh = this.getStorona1() * this.getStorona2();
        //setPloshad(this.getStorona1() * this.getStorona2());
        return plosh;
    }

    public void perimetrP() {
        setPerimetr(this.getStorona1() * 2 + this.getStorona2() * 2);
    }

    public void print() {
        System.out.println("Площадь = " + this.ploshad + ", периметр = " + this.perimetr);
    }
}

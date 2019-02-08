package modul2.lesson9.homeWork;

public class Triangle {
    private double storona1;
    private double storona2;
    private double storona3;
    private double plosad;
    private double perimetr;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        storona1 = a;
        storona2 = b;
        storona3 = c;
    }

    public Triangle(double a, double b, double c, double plosh, double perim) {
        storona1 = a;
        storona2 = b;
        storona3 = c;
        plosad = plosh;
        perimetr = perim;
    }

    public void setStorona1(double storona1) {
        this.storona1 = storona1;
    }

    public double getStorona1() {
        return storona1;
    }

    public void setStorona2(double storona2) {
        this.storona2 = storona2;
    }

    public double getStorona2() {
        return storona2;
    }

    public void setStorona3(double storona3) {
        this.storona3 = storona3;
    }

    public double getStorona3() {
        return storona3;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPlosad(double plosad) {
        this.plosad = plosad;
    }

    public double getPlosad() {
        return plosad;
    }

    public void ploshad() {
        double poluP = (this.getStorona1() + this.getStorona2() + this.getStorona3()) / 2;
        double rezult = Math.sqrt(poluP * (poluP - this.getStorona1()) * (poluP - this.getStorona2()) * (poluP - this.getStorona3()));
        setPlosad(rezult);
    }

    public void perimetr() {
        double perim = this.getStorona1() + this.getStorona2() + this.getStorona3();
        setPerimetr(perim);
    }

    public void print() {
        System.out.println("Площадь = " + this.plosad + ", периметр = " + this.perimetr);
    }
}

package modul2.lesson11.figurs;

public class Treuholnik implements IFigur {
    private double a;
    private double b;
    private double c;

    public Treuholnik() {
    }

    public Treuholnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double ploshad() {
        double poluP = (this.a + this.b + this.c) / 2;
        return Math.sqrt(poluP * (poluP - this.a) * (poluP - this.b) * (poluP - this.c));
    }

    @Override
    public double perimetr() {
        return this.a + this.b + this.c;
    }

    @Override
    public void print() {
        System.out.println("treugolnik");
    }
}

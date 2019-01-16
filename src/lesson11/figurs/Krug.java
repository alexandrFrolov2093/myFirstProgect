package lesson11.figurs;

public class Krug implements IFigur {
    private double radius;

    public Krug() {
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimetr() {

        return 2*Math.PI*this.radius;
    }

    @Override
    public void print() {
        System.out.println("krug");
    }
}

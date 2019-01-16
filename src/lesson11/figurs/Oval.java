package lesson11.figurs;

public class Oval implements IFigur {
    private double radiusA;
    private double radiusB;

    public Oval() {
    }

    public Oval(double radiusA, double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public double getRadiusA() {
        return radiusA;
    }

    public void setRadiusA(double radiusA) {
        this.radiusA = radiusA;
    }

    public double getRadiusB() {
        return radiusB;
    }

    public void setRadiusB(double radiusB) {
        this.radiusB = radiusB;
    }

    @Override
    public double ploshad() {
        return Math.PI * this.radiusA * this.radiusB;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * (Math.sqrt((2 * this.radiusA + 2 * this.radiusB) / 2));
    }

    @Override
    public void print() {
        System.out.println("oval");
    }
}

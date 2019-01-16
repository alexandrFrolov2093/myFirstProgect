package lesson9.homeWork;

public class Round {
    private double radius;
    private double ploshad;
    private double perimetr;

    public Round() {

    }

    public Round(double radiusRound) {
        radius = radiusRound;
    }

    public Round(double radiusR, double ploshadR, double perimetrR) {
        radius = radiusR;
        perimetr = perimetrR;
        ploshad = ploshadR;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPloshad(double ploshad) {
        this.ploshad = ploshad;
    }

    public double getPloshad() {
        return ploshad;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void plosh() {
        setPloshad(Math.PI * this.getRadius() * this.getRadius());
    }

    public void dlinnaOkr() {
        setPerimetr(Math.PI * 2 * this.radius);
    }

    public void print() {
        System.out.println("Площадь круга = " + this.ploshad + ", длинна окружности = " + this.perimetr);
    }
}

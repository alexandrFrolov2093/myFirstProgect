package modul2.lesson11.figurs;

public class Pramougolnik implements IFigur {
    private double storonaA;
    private double storonaB;

    public Pramougolnik() {
    }

    public Pramougolnik(double storonaA, double storonaB) {
        this.storonaA = storonaA;
        this.storonaB = storonaB;
    }

    public double getStoronaA() {
        return storonaA;
    }

    public void setStoronaA(double storonaA) {
        this.storonaA = storonaA;
    }

    public double getStoronaB() {
        return storonaB;
    }

    public void setStoronaB(double storonaB) {
        this.storonaB = storonaB;
    }

    @Override
    public double ploshad() {
        return this.storonaA * this.storonaB;
    }

    @Override
    public double perimetr() {
        return this.storonaB * 2 + this.storonaA * 2;
    }

    @Override
    public void print() {
        System.out.println("pryamoug");
    }
}

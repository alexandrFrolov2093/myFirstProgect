package modul2.lesson11.figurs;

public class Kvadrat implements IFigur{
    private Pramougolnik pramoygolnik = null;

    public Kvadrat() {
    }

    public Kvadrat(int a){
        Pramougolnik pramoygolnik = new Pramougolnik(a,a);
    }

    public double getA(){
        return pramoygolnik.getStoronaA();
    }

    @Override
    public double perimetr() {
        return pramoygolnik.perimetr();
    }

    @Override
    public double ploshad() {
        return pramoygolnik.ploshad();
    }

    @Override
    public void print() {
        System.out.println("Квадрат: " + pramoygolnik.getStoronaA());
    }
}

package modul2.lesson10;

public class Monkey extends Animal {
    @Override
    public void print() {
        System.out.println("Monkey name = " + this.getName() + " cost = " + this.getCost());
    }
}

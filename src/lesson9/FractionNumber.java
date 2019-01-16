package lesson9;

public class FractionNumber {
    private int chislitel;
    private int znamenatel;

    public FractionNumber() {
    }

    public FractionNumber(int chislit, int znam) {
        chislitel = chislit;
        znamenatel = znam;
    }

    public void setChislitel(int newChislit) {
        chislitel = newChislit;
    }

    public int getChislitel() {
        return chislitel;
    }

    public void setZnamenatel(int newZnamenatel) {
        znamenatel = newZnamenatel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public FractionNumber add(FractionNumber drob2){
        int obshiyZnamenatel = this.getZnamenatel() * drob2.getZnamenatel();
        int chislitel = (this.getChislitel() * drob2.getZnamenatel()) + (this.getZnamenatel() * drob2.getChislitel());
        FractionNumber result = new FractionNumber(chislitel,obshiyZnamenatel);
        return result;
    }
}

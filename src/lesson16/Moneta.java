package lesson16;

import java.util.Objects;

public class Moneta implements Comparable<Moneta> {
    private int godVipuska;
    private String metall;
    private int nomenal;
    private int colvoZvizd;

    public Moneta() {
    }

    public Moneta(int godVipuska, String metall, int nomenal, int colvoZvizd) {
        this.godVipuska = godVipuska;
        this.metall = metall;
        this.nomenal = nomenal;
        this.colvoZvizd = colvoZvizd;
    }

    public int getGodVipuska() {
        return godVipuska;
    }

    public void setGodVipuska(int godVipuska) {
        this.godVipuska = godVipuska;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getNomenal() {
        return nomenal;
    }

    public void setNomenal(int nomenal) {
        this.nomenal = nomenal;
    }

    public int getColvoZvizd() {
        return colvoZvizd;
    }

    public void setColvoZvizd(int colvoZvizd) {
        this.colvoZvizd = colvoZvizd;
    }


    @Override
    public String toString() {
        return "Moneta{" +
                "godVipuska=" + godVipuska +
                ", metall='" + metall + '\'' +
                ", nomenal=" + nomenal +
                ", colvoZvizd=" + colvoZvizd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneta moneta = (Moneta) o;
        return godVipuska == moneta.godVipuska &&
                nomenal == moneta.nomenal &&
                colvoZvizd == moneta.colvoZvizd &&
                Objects.equals(metall, moneta.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(godVipuska, metall, nomenal, colvoZvizd);
    }

    @Override
    public int compareTo(Moneta o) {
        int year1 = this.getGodVipuska();
        int year2 = o.getGodVipuska();
        if (year1 != year2)
            return year1 - year2;
        int nomenal1 = this.getNomenal();
        int nomenal2 = o.getNomenal();
        if (nomenal1!=nomenal2)
            return nomenal1 - nomenal2;
        if(this.getColvoZvizd() != o.getColvoZvizd())
            return this.getColvoZvizd() - o.getColvoZvizd();
        return this.getMetall().compareTo(o.getMetall());
    }
}

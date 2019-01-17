package lesson12.magazin.homeWork;

import java.util.Date;

public class VoprosOtvet {
    private String vopros;
    private String otvet;
    private int colvoVoprosov;
    private int colvoOtvetov;
    private Date date;
    private Uzer uzer;
    private String harakteristikaVoprosa;

    public VoprosOtvet() {
    }

    public String getVopros() {
        return vopros;
    }

    public void setVopros(String vopros) {
        this.vopros = vopros;
    }

    public String getOtvet() {
        return otvet;
    }

    public void setOtvet(String otvet) {
        this.otvet = otvet;
    }

    public int getColvoVoprosov() {
        return colvoVoprosov;
    }

    public void setColvoVoprosov(int colvoVoprosov) {
        this.colvoVoprosov = colvoVoprosov;
    }

    public int getColvoOtvetov() {
        return colvoOtvetov;
    }

    public void setColvoOtvetov(int colvoOtvetov) {
        this.colvoOtvetov = colvoOtvetov;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Uzer getUzer() {
        return uzer;
    }

    public void setUzer(Uzer uzer) {
        this.uzer = uzer;
    }

    public String getHarakteristikaVoprosa() {
        return harakteristikaVoprosa;
    }

    public void setHarakteristikaVoprosa(String harakteristikaVoprosa) {
        this.harakteristikaVoprosa = harakteristikaVoprosa;
    }

    @Override
    public String toString() {
        return "VoprosOtvet{" +
                "vopros='" + vopros + '\'' +
                ", otvet='" + otvet + '\'' +
                ", colvoVoprosov=" + colvoVoprosov +
                ", colvoOtvetov=" + colvoOtvetov +
                ", date=" + date +
                ", uzer=" + uzer +
                ", harakteristikaVoprosa='" + harakteristikaVoprosa + '\'' +
                '}';
    }
}

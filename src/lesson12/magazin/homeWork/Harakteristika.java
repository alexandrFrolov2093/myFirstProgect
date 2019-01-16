package lesson12.magazin.homeWork;

public class Harakteristika {
    private int moshnost;
    private String parovoyUdar;
    private String funcRazbryzgivaniya;
    private String avtoVicluchenie;
    private String besprovodnoeIspolzovanie;
    private double dlinnaShnura;
    private String komplektaciya;

    public Harakteristika() {
    }

    public int getMoshnost() {
        return moshnost;
    }

    public void setMoshnost(int moshnost) {
        this.moshnost = moshnost;
    }

    public String getParovoyUdar() {
        return parovoyUdar;
    }

    public void setParovoyUdar(String parovoyUdar) {
        this.parovoyUdar = parovoyUdar;
    }

    public String getFuncRazbryzgivaniya() {
        return funcRazbryzgivaniya;
    }

    public void setFuncRazbryzgivaniya(String funcRazbryzgivaniya) {
        this.funcRazbryzgivaniya = funcRazbryzgivaniya;
    }

    public String getAvtoVicluchenie() {
        return avtoVicluchenie;
    }

    public void setAvtoVicluchenie(String avtoVicluchenie) {
        this.avtoVicluchenie = avtoVicluchenie;
    }

    public String getBesprovodnoeIspolzovanie() {
        return besprovodnoeIspolzovanie;
    }

    public void setBesprovodnoeIspolzovanie(String besprovodnoeIspolzovanie) {
        this.besprovodnoeIspolzovanie = besprovodnoeIspolzovanie;
    }

    public double getDlinnaShnura() {
        return dlinnaShnura;
    }

    public void setDlinnaShnura(double dlinnaShnura) {
        this.dlinnaShnura = dlinnaShnura;
    }

    public String getKomplektaciya() {
        return komplektaciya;
    }

    public void setKomplektaciya(String komplektaciya) {
        this.komplektaciya = komplektaciya;
    }

    @Override
    public String toString() {
        return "Harakteristika{" +'\n' +
                "moshnost=" + moshnost +'\n' +
                ", parovoyUdar='" + parovoyUdar + '\'' +'\n' +
                ", funcRazbryzgivaniya='" + funcRazbryzgivaniya + '\'' +'\n' +
                ", avtoVicluchenie='" + avtoVicluchenie + '\'' +'\n' +
                ", besprovodnoeIspolzovanie='" + besprovodnoeIspolzovanie + '\'' +'\n' +
                ", dlinnaShnura=" + dlinnaShnura +'\n' +
                ", komplektaciya='" + komplektaciya + '\'' +'\n' +
                '}';
    }
}

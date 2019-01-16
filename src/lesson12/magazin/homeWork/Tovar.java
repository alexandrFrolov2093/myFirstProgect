package lesson12.magazin.homeWork;

import java.util.Arrays;

public class Tovar {
    private String name;
    private String opisanie;
    private Harakteristika harakteristika;
    private Photo glavPhoto;
    private Otzyv[] otzovs = new  Otzyv[10];
    private Photo[] massPhoto = new Photo[10];
    private String srticul;
    private String stranaProizvodstva;
    private String srokGarantii;
    private int price;
    private double ocenka;
    private Komentarii[] komentariis = new Komentarii[10];
    private  int starayaPrice;

    public Tovar() {
    }

    public int getStarayaPrice() {
        return starayaPrice;
    }

    public void setStarayaPrice(int starayaPrice) {
        this.starayaPrice = starayaPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Harakteristika getHarakteristika() {
        return harakteristika;
    }

    public void setHarakteristika(Harakteristika harakteristika) {
        this.harakteristika = harakteristika;
    }

    public Photo getGlavPhoto() {
        return glavPhoto;
    }

    public void setGlavPhoto(Photo glavPhoto) {
        this.glavPhoto = glavPhoto;
    }

    public Otzyv[] getOtzovs() {
        return otzovs;
    }

    public Photo[] getMassPhoto() {
        return massPhoto;
    }

    public String getSrticul() {
        return srticul;
    }

    public void setSrticul(String srticul) {
        this.srticul = srticul;
    }

    public String getStranaProizvodstva() {
        return stranaProizvodstva;
    }

    public void setStranaProizvodstva(String stranaProizvodstva) {
        this.stranaProizvodstva = stranaProizvodstva;
    }

    public String getSrokGarantii() {
        return srokGarantii;
    }

    public void setSrokGarantii(String srokGarantii) {
        this.srokGarantii = srokGarantii;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getOcenka() {
        return ocenka;
    }

    public void setOcenka(double ocenka) {
        this.ocenka = ocenka;
    }

    public Komentarii[] getKomentariis() {
        return komentariis;
    }

    public void potoToDopPhoto(Photo photoToAdd){
        for (int i = 0; i < massPhoto.length; i++){
            if (massPhoto[i] == null){
                massPhoto[i] = photoToAdd;
                break;
            }
        }
    }

    public void addOtzivToOtziv(Otzyv otzivToAdd){
        for (int i = 0; i < otzovs.length; i++){
            if (otzovs[i] == null) {
                otzovs[i] = otzivToAdd;
                break;
            }
        }
    }

    public void addKomentariyToKomentarii(Komentarii komentariiToAdd){
        for (int i = 0; i < komentariis.length; i++){
            if (komentariis[i] == null){
                komentariis[i] = komentariiToAdd;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Tovar{" +'\n' +
                "name='" + name + '\'' +'\n' +
                ", opisanie='" + opisanie + '\'' +'\n' +
                ", harakteristika=" + harakteristika +'\n' +
                ", glavPhoto=" + glavPhoto +'\n' +
                ", otzovs=" + Arrays.toString(otzovs) +'\n' +
                ", massPhoto=" + Arrays.toString(massPhoto) +'\n' +
                ", srticul='" + srticul + '\'' +'\n' +
                ", stranaProizvodstva='" + stranaProizvodstva + '\'' +'\n' +
                ", srokGarantii='" + srokGarantii + '\'' +'\n' +
                ", price=" + price +'\n' +
                ", ocenka=" + ocenka +'\n' +
                ", komentariis=" + Arrays.toString(komentariis) +'\n' +
                ", starayaPrice=" + starayaPrice +'\n' +
                '}';
    }
}

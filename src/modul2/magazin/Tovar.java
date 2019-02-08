package modul2.magazin;

import java.util.Arrays;

public class Tovar {
    private String mainName;
    private String articul;
    private int price;
    private Harakteristika harakteristika;
    private String shortName;
    private Photo glavPhoto;
    private Photo[] dopPhoto = new Photo[10];
    private String maimInfo;
    private Tovar[] recomendTovars = new Tovar[10];

    public Tovar() {
    }

    public Tovar(String mainName, String articul, int price, Harakteristika harakteristika, String shortName, Photo glavPhoto, Photo[] dopPhoto, String maimInfo, Tovar[] recomendTovars) {
        this.mainName = mainName;
        this.articul = articul;
        this.price = price;
        this.harakteristika = harakteristika;
        this.shortName = shortName;
        this.glavPhoto = glavPhoto;
        this.dopPhoto = dopPhoto;
        this.maimInfo = maimInfo;
        this.recomendTovars = recomendTovars;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Harakteristika getHarakteristika() {
        return harakteristika;
    }

    public void setHarakteristika(Harakteristika harakteristika) {
        this.harakteristika = harakteristika;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Photo getGlavPhoto() {
        return glavPhoto;
    }

    public void setGlavPhoto(Photo glavPhoto) {
        this.glavPhoto = glavPhoto;
    }

    public Photo[] getDopPhoto() {
        return dopPhoto;
    }

    public void potoToDopPhoto(Photo photoToAdd){
        for (int i = 0; i < dopPhoto.length; i++){
            if (dopPhoto[i] == null){
                dopPhoto[i] = photoToAdd;
                break;
            }
        }
    }

    public String getMaimInfo() {
        return maimInfo;
    }

    public void setMaimInfo(String maimInfo) {
        this.maimInfo = maimInfo;
    }

    public Tovar[] getRecomendTovars() {
        return recomendTovars;
    }

    public void setRecomendTovars(Tovar[] recomendTovars) {
        this.recomendTovars = recomendTovars;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "mainName='" + mainName + '\'' +'\n' +
                ", articul='" + articul + '\'' +'\n' +
                ", price=" + price +'\n' +
                ", harakteristika=" + harakteristika +'\n' +
                ", shortName='" + shortName + '\'' +'\n' +
                ", glavPhoto=" + glavPhoto +'\n' +
                ", dopPhoto=" + Arrays.toString(dopPhoto) +'\n' +
                ", maimInfo='" + maimInfo + '\'' +'\n' +
                ", recomendTovars=" + Arrays.toString(recomendTovars) +'\n' +
                '}';
    }
}

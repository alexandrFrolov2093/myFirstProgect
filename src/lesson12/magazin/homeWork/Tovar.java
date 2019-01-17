package lesson12.magazin.homeWork;

import java.util.Arrays;

public class Tovar {
    private String name;
    private String opisanie;
    private Harakteristika[] harakteristika;
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
    private Vidio[] vidios;
    private Magazin[] magazins;
    private Review[] reviews;
    private VoprosOtvet[] voprosOtvets;
    private File[] files;
    private Driver[] drivers;




    public Tovar() {
    }

    public void setHarakteristika(Harakteristika[] harakteristika) {
        this.harakteristika = harakteristika;
    }

    public void setOtzovs(Otzyv[] otzovs) {
        this.otzovs = otzovs;
    }

    public void setMassPhoto(Photo[] massPhoto) {
        this.massPhoto = massPhoto;
    }

    public void setKomentariis(Komentarii[] komentariis) {
        this.komentariis = komentariis;
    }

    public Vidio[] getVidios() {
        return vidios;
    }

    public void setVidios(Vidio[] vidios) {
        this.vidios = vidios;
    }

    public Magazin[] getMagazins() {
        return magazins;
    }

    public void setMagazins(Magazin[] magazins) {
        this.magazins = magazins;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public VoprosOtvet[] getVoprosOtvets() {
        return voprosOtvets;
    }

    public void setVoprosOtvets(VoprosOtvet[] voprosOtvets) {
        this.voprosOtvets = voprosOtvets;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
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

    public Harakteristika[] getHarakteristika() {
        return harakteristika;
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
    public void harakteristikaToHarakteristika(Harakteristika harakteristika1){
        for (int i = 0; i < harakteristika.length; i++){
            if (harakteristika[i] == null){
                harakteristika[i] = harakteristika1;
                break;
            }
        }
    }
    public void vidioToVidio(Vidio vidioToAdd){
        for (int i = 0; i < vidios.length; i++){
            if (vidios[i] == null){
                vidios[i] = vidioToAdd;
                break;
            }
        }
    }
    public void vopOtvToVopOtv(VoprosOtvet voprosOtvetToAdd){
        for (int i = 0; i < voprosOtvets.length; i++){
            if (voprosOtvets[i] == null){
                voprosOtvets[i] = voprosOtvetToAdd;
                break;
            }
        }
    }
    public void magazinToMagazin(Magazin magazinToAdd){
        for (int i = 0; i < magazins.length; i++){
            if (magazins[i] == null){
                magazins[i] = magazinToAdd;
                break;
            }
        }
    }
    public void driverToDrivers(Driver driverToAdd){
        for (int i = 0; i < drivers.length; i++){
            if (drivers[i] == null){
                drivers[i] = driverToAdd;
                break;
            }
        }
    }
    public void fileToFiles(File fileToAdd){
        for (int i = 0; i < files.length; i++){
            if (files[i] == null){
                files[i] = fileToAdd;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", opisanie='" + opisanie + '\'' +
                ", harakteristika=" + Arrays.toString(harakteristika) +
                ", glavPhoto=" + glavPhoto +
                ", otzovs=" + Arrays.toString(otzovs) +
                ", massPhoto=" + Arrays.toString(massPhoto) +
                ", srticul='" + srticul + '\'' +
                ", stranaProizvodstva='" + stranaProizvodstva + '\'' +
                ", srokGarantii='" + srokGarantii + '\'' +
                ", price=" + price +
                ", ocenka=" + ocenka +
                ", komentariis=" + Arrays.toString(komentariis) +
                ", starayaPrice=" + starayaPrice +
                ", vidios=" + Arrays.toString(vidios) +
                ", magazins=" + Arrays.toString(magazins) +
                ", reviews=" + Arrays.toString(reviews) +
                ", voprosOtvets=" + Arrays.toString(voprosOtvets) +
                ", files=" + Arrays.toString(files) +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}

package lesson12.magazin.homeWork;

import java.util.Arrays;
import java.util.Date;

public class Otzyv {
    private String dostoinstva;
    private String nedostatky;
    private String kamenariy;
    private Uzer uzer;
    private int ball;
    private String city;
    private String magazin;
    private Photo[] photos;
    private int likes;
    private Date datePublic;
    private Date dateUse;


    public Otzyv() {

    }

    public Uzer getUzer() {
        return uzer;
    }

    public void setUzer(Uzer uzer) {
        this.uzer = uzer;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMagazin() {
        return magazin;
    }

    public void setMagazin(String magazin) {
        this.magazin = magazin;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(Date datePublic) {
        this.datePublic = datePublic;
    }

    public Date getDateUse() {
        return dateUse;
    }

    public void setDateUse(Date dateUse) {
        this.dateUse = dateUse;
    }

    public String getDostoinstva() {
        return dostoinstva;
    }

    public void setDostoinstva(String dostoinstva) {
        this.dostoinstva = dostoinstva;
    }

    public String getNedostatky() {
        return nedostatky;
    }

    public void setNedostatky(String nedostatky) {
        this.nedostatky = nedostatky;
    }

    public String getKamenariy() {
        return kamenariy;
    }

    public void setKamenariy(String kamenariy) {
        this.kamenariy = kamenariy;
    }


    public void potoToPhoto(Photo photoToAdd){
        for (int i = 0; i < photos.length; i++){
            if (photos[i] == null){
                photos[i] = photoToAdd;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Otzyv{" +
                "dostoinstva='" + dostoinstva + '\'' +
                ", nedostatky='" + nedostatky + '\'' +
                ", kamenariy='" + kamenariy + '\'' +
                ", uzer=" + uzer +
                ", ball=" + ball +
                ", city='" + city + '\'' +
                ", magazin='" + magazin + '\'' +
                ", photos=" + Arrays.toString(photos) +
                ", likes=" + likes +
                ", datePublic=" + datePublic +
                ", dateUse=" + dateUse +
                '}';
    }

}

package modul2.magazin.homeWork;

import java.util.Date;

public class Komentarii {
    private String komentariy;
    private Date date;
    private Uzer uzer;
    private int likes;

    public Komentarii(){

    }
    public Komentarii(String komentariy){
        this.komentariy = komentariy;
    }

    public String getKomentariy() {
        return komentariy;
    }

    public void setKomentariy(String komentariy) {
        this.komentariy = komentariy;
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Komentarii{" +'\n' +
                "komentariy='" + komentariy + '\'' + '\n' +
                '}';
    }
}

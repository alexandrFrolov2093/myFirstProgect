package lesson12.magazin.homeWork;

public class Komentarii {
    private String komentariy;

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

    @Override
    public String toString() {
        return "Komentarii{" +'\n' +
                "komentariy='" + komentariy + '\'' + '\n' +
                '}';
    }
}

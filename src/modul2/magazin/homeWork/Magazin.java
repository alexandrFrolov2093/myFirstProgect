package modul2.magazin.homeWork;


public class Magazin {
    private String name;
    private String chasyRaboty;
    private String adres;
    private int nalichie;
    private String vremyaPostupleniya;

    public Magazin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChasyRaboty() {
        return chasyRaboty;
    }

    public void setChasyRaboty(String chasyRaboty) {
        this.chasyRaboty = chasyRaboty;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getNalichie() {
        return nalichie;
    }

    public void setNalichie(int nalichie) {
        this.nalichie = nalichie;
    }

    public String getVremyaPostupleniya() {
        return vremyaPostupleniya;
    }

    public void setVremyaPostupleniya(String vremyaPostupleniya) {
        this.vremyaPostupleniya = vremyaPostupleniya;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "name='" + name + '\'' +
                ", chasyRaboty='" + chasyRaboty + '\'' +
                ", adres='" + adres + '\'' +
                ", nalichie=" + nalichie +
                ", vremyaPostupleniya='" + vremyaPostupleniya + '\'' +
                '}';
    }
}

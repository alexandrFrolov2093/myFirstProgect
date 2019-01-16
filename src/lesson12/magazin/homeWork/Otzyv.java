package lesson12.magazin.homeWork;

public class Otzyv {
    private String dostoinstva;
    private String nedostatky;
    private String kamenariy;
    private String name;

    public Otzyv() {

    }

    public Otzyv(String dostoinstva, String nedostatky, String kamenariy, String name) {
        this.dostoinstva = dostoinstva;
        this.nedostatky = nedostatky;
        this.kamenariy = kamenariy;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Otzyv{" +
                "dostoinstva='" + dostoinstva + '\'' +'\n' +
                ", nedostatky='" + nedostatky + '\'' +'\n' +
                ", kamenariy='" + kamenariy + '\'' +'\n' +
                ", name='" + name + '\'' +'\n' +
                '}';
    }
}

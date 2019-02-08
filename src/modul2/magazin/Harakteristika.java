package modul2.magazin;

public class Harakteristika {
    private double obyom;
    private double diametr;
    private String material;
    private double ves;
    private String primenenie;
    private String razmer;

    public Harakteristika(){

    }

    public Harakteristika(double obyom, double diametr, String material, double ves, String primenenie, String razmer){
        this.diametr = diametr;
        this.material = material;
        this.obyom = obyom;
        this.ves = ves;
        this.primenenie = primenenie;
        this.razmer = razmer;
    }

    public double getObyom() {
        return obyom;
    }

    public double getDiametr() {
        return diametr;
    }

    public String getMaterial() {
        return material;
    }

    public double getVes() {
        return ves;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrimenenie() {
        return primenenie;
    }

    public void setObyom(double obyom) {
        this.obyom = obyom;
    }

    public void setPrimenenie(String primenenie) {
        this.primenenie = primenenie;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getRazmer() {
        return razmer;
    }

    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }

    @Override
    public String toString() {
        return "Harakteristika{" +'\n' +
                "obyom=" + obyom +'\n' +
                ", diametr=" + diametr +'\n' +
                ", material='" + material + '\'' +'\n' +
                ", ves=" + ves +'\n' +
                ", primenenie='" + primenenie + '\'' +'\n' +
                ", razmer='" + razmer + '\'' +'\n' +
                '}';
    }
}

package modul2.magazin.homeWork;

public class Harakteristika {
   private String name;
   private String harakreristika;

    public Harakteristika() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarakreristika() {
        return harakreristika;
    }

    public void setHarakreristika(String harakreristika) {
        this.harakreristika = harakreristika;
    }

    @Override
    public String toString() {
        return "Harakteristika{" +
                "name='" + name + '\'' +
                ", harakreristika='" + harakreristika + '\'' +
                '}';
    }
}

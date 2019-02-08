package modul2.magazin.homeWork;

public class Driver {
    private String pathToDriver;
    private String opisanie;
    private double ves;

    public Driver() {
    }

    public String getPathToDriver() {
        return pathToDriver;
    }

    public void setPathToDriver(String pathToDriver) {
        this.pathToDriver = pathToDriver;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "pathToDriver='" + pathToDriver + '\'' +
                ", opisanie='" + opisanie + '\'' +
                ", ves=" + ves +
                '}';
    }
}

package modul2.magazin.homeWork;

public class File {
    private String pathToFile;
    private String opisanie;
    private double ves;

    public File() {
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
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
        return "File{" +
                "pathToFile='" + pathToFile + '\'' +
                ", opisanie='" + opisanie + '\'' +
                ", ves=" + ves +
                '}';
    }
}

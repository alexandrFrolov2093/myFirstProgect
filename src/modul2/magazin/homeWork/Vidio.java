package modul2.magazin.homeWork;

public class Vidio {
    private String pathToVidio;
    private String titleVidio;
    private String opisanie;

    public Vidio() {
    }

    public String getPathToVidio() {
        return pathToVidio;
    }

    public void setPathToVidio(String pathToVidio) {
        this.pathToVidio = pathToVidio;
    }

    public String getTitleVidio() {
        return titleVidio;
    }

    public void setTitleVidio(String titleVidio) {
        this.titleVidio = titleVidio;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    @Override
    public String toString() {
        return "Vidio{" +
                "pathToVidio='" + pathToVidio + '\'' +
                ", titleVidio='" + titleVidio + '\'' +
                ", opisanie='" + opisanie + '\'' +
                '}';
    }
}

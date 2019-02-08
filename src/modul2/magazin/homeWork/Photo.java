package modul2.magazin.homeWork;

public class Photo {
    private String pathToPhoto;
    private String title;
    private String opisanie;

    public Photo() {

    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Photo(String pathToPhoto, String title) {
        this.pathToPhoto = pathToPhoto;
        this.title = title;
    }

    public String getPathToPhoto() {
        return this.pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "pathToPhoto='" + pathToPhoto + '\'' +
                ", title='" + title + '\'' +
                ", opisanie='" + opisanie + '\'' +
                '}';
    }
}

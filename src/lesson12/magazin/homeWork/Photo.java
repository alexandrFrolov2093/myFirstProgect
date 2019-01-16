package lesson12.magazin.homeWork;

public class Photo {
    private String pathToPhoto;
    private String title;

    public Photo() {

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
                "pathToPhoto='" + pathToPhoto + '\'' +'\n' +
                ", title='" + title + '\'' +'\n' +
                '}';
    }
}

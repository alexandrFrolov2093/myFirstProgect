package lesson12.magazin.homeWork;

import java.util.Arrays;

public class Review {
    private Vidio vidio;
    private Photo[] photos;
    private String text;

    public Review() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Vidio getVidio() {
        return vidio;
    }

    public void setVidio(Vidio vidio) {
        this.vidio = vidio;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public void potoToPhoto(Photo photoToAdd){
        for (int i = 0; i < photos.length; i++){
            if (photos[i] == null){
                photos[i] = photoToAdd;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Review{" +
                "vidio=" + vidio +
                ", photos=" + Arrays.toString(photos) +
                ", text='" + text + '\'' +
                '}';
    }
}

package modul2.magazin.homeWork;

import java.util.Arrays;
import java.util.Date;

public class Uzer {
    private Otzyv[] otzyvs;
    private Photo photo;
    private String name;
    private Date dateReg;
    private String city;

    public Uzer() {
    }

    public Otzyv[] getOtzyvs() {
        return otzyvs;
    }

    public void setOtzyvs(Otzyv[] otzyvs) {
        this.otzyvs = otzyvs;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public void setDateReg(Date dateReg) {
        this.dateReg = dateReg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addOtzivToOtziv(Otzyv otzivToAdd){
        for (int i = 0; i < otzyvs.length; i++){
            if (otzyvs[i] == null) {
                otzyvs[i] = otzivToAdd;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Uzer{" +
                "otzyvs=" + Arrays.toString(otzyvs) +
                ", photo=" + photo +
                ", name='" + name + '\'' +
                ", dateReg=" + dateReg +
                ", city='" + city + '\'' +
                '}';
    }
}

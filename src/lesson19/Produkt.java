package lesson19;

import java.util.Objects;

public class Produkt {
    private String name;
    private int price;
    private int id;

    public Produkt() {
    }

    public Produkt(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return price == produkt.price &&
                id == produkt.id &&
                Objects.equals(name, produkt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, id);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

package buoi06.btvn;

import java.time.LocalDate;

public class Book {
    private String name;
    private String price;
    private double quanity;
    private String day;

    public Book() {
    }

    public Book(String name, String price, double quanity, String day) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getQuanity() {
        return quanity;
    }

    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quanity=" + quanity +
                ", day='" + day + '\'' +
                '}';
    }
}

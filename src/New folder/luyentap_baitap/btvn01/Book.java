package luyentap_baitap.btvn01;

public class Book {
    private String name;
    private long price;
    private int quanity;
    private String dateCreat;

    public Book() {
    }

    public Book(String name, long price, int quanity, String dateCreat) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.dateCreat = dateCreat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getDateCreat() {
        return dateCreat;
    }

    public void setDateCreat(String dateCreat) {
        this.dateCreat = dateCreat;
    }

    @Override
    public String  toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quanity=" + quanity +
                ", dateCreat='" + dateCreat + '\'' +
                '}';
    }
}

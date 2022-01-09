package buoi06.btvn;

public class ScienceBook extends Book {
    private String type;


    public ScienceBook() {
    }

    public ScienceBook(String type) {
        this.type = type;
    }

    public ScienceBook(String name, String price, double quanity, String day, String type) {
        super(name, price, quanity, day);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", quanity=" + getQuanity() +
                ", day='" + getDay() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}

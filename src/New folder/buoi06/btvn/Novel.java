package buoi06.btvn;

public class Novel extends Book {
    private String author;

    public Novel() {
    }

    public Novel(String author) {
        this.author = author;
    }

    public Novel(String name, String price, double quanity, String day, String author) {
        super(name, price, quanity, day);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

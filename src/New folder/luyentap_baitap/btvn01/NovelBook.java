package luyentap_baitap.btvn01;

public class NovelBook extends Book{
    private String author;

    public NovelBook(String name, long price, int quanity, String dateCreat, String author) {
        super(name, price, quanity, dateCreat);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NovelBook{" + super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}

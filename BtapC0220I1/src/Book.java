public class Book {
    private long bookCode;
    private String name,author;
    public int price;
    public Book(long bookCode,String name,String author,int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public long getBookCode() {
        return bookCode;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

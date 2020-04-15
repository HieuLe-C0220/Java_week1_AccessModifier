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
        return this.bookCode;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPrice() {
        return this.price;
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
    public String toString(){
        return "Code : "+getBookCode()
                +", Name: "+ getName()
                +", Author: "+getAuthor()
                +", Price : " + getPrice();
    }
}

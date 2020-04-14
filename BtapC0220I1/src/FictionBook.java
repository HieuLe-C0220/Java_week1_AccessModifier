public class FictionBook extends Book {
    private String catelogy;
    public FictionBook(long bookCode, String name, String author, int price, String catelogy) {
        super(bookCode, name, author, price);
        this.catelogy = catelogy;
    }
    public String getCatelogy() {
        return catelogy;
    }

    public void setCatelogy(String catelogy) {
        this.catelogy = catelogy;
    }
}

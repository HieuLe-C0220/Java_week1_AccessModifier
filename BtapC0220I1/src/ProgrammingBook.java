public class ProgrammingBook extends Book {
    private String language = "Java";
    private String framework;
    public ProgrammingBook(long bookCode, String name, String author, int price, String language, String framework) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }
    public String getLanguage() {
        return this.language;
    }
    public String getFramework() {
        return this.framework;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }
}

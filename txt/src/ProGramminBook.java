public class ProGramminBook {
    String bookCode;
    String name;
    String author;
    int price;
    int number;
    String language;
    String framework;

    public String getBookCode() {
        return bookCode;
    }

    public ProGramminBook(String bookCode, String name, String author, int price, int number, String language, String framework) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
        this.number = number;
        this.language = language;
        this.framework = framework;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public int getAmount() {
        return price * number;
    }
}

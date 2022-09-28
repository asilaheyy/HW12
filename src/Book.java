public class Book {
    private String bookName;
    private String booksAuthor;
    private int year;

    public Book(String bookName, int year, String booksAuthor) {
        this.bookName = bookName;
        this.year = year;
        this.booksAuthor = booksAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getBooksAuthor() {
        return this.booksAuthor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }
}

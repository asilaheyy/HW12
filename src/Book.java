public class Book {
    private String bookName;
    private Author booksAuthor;
    private int year;



    public Book(String bookName, Author booksAuthor, int year) {
        this.bookName = bookName;
        this.booksAuthor = booksAuthor;
        this.year = year;


    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }
}

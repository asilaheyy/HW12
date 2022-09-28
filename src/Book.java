public class Book {
    private String bookName;
    Author booksAuthor = new Author();

    private int year;

    public Book(String bookName, int year) {
        this.bookName = bookName;
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

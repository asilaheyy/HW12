public class Main {
    public static void main(String[] args) {
        String firstBook = "A";
        String firstBooksAuthor = "A A";
        int firstBookYear = 2020;

        String secondBook = "B";
        String secondBooksAuthor = "B B";
        int secondBookYear = 2011;

        String[] books = {"A", "B"};
        String[] authors = {" K.A", "B.B"};
        int[] years = {2020, 2011};

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book name: " + books[i] + " Year: " + years[i] + " Author: " + authors[i]);

        }
        Book first = new Book("A", 2020);
        Author firstAuthor = new Author(" K.A");
        System.out.println("Book: " + first.getBookName());
        System.out.println("Publishing year: " + first.getYear());
        System.out.println("Author: " + firstAuthor.getAuthor());

        Book second = new Book("B", 2011);
        Author secondAuthor = new Author("B.B");
        System.out.println("Book: " + second.getBookName());
        System.out.println("Publishing year: " + second.getYear());
        second.setYear(2012);
        System.out.println(second.getYear());
        System.out.println("Author: " + secondAuthor.getAuthor());


    }
}
public class Main {
    public static void main(String[] args) {
        String firstBook = "Анна Каренина";
        String firstBooksAuthor = "Лев Толстой";
        int firstBookYear = 1878;

        String secondBook = "Капитанская дочка";
        String secondBooksAuthor = "Александр Пушкин";
        int secondBookYear = 1836;

        String[] books = {"Анна Каренина", "Капитанская дочка"};
        String[] authors = {"Лев Толстой", "Александр Пушкин"};
        int[] years = {1878, 1836};

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book name: " + books[i] + " Year: " + years[i] + " Author: " + authors[i]);

        }
        Book first = new Book("Анна Каренина",new Author(" Лев ", " Толстой ") , 1878);
        Author firstAuthor = new Author ("Лев ", " Толстой");
        System.out.println("Book: " + first.getBookName());
        System.out.println("Publishing year: " + first.getYear());
        System.out.println("Author: " + firstAuthor.getAuthorFirstName() + firstAuthor.getAuthorLastName());

        Book second = new Book("Капитанская дочка",new Author(" Александр "," Пушкин ") , 1836);
        Author secondAuthor = new Author("Александр ", " Пушкин");
        System.out.println("Book: " + second.getBookName());
        System.out.println("Publishing year: " + second.getYear());
        second.setYear(2022);
        System.out.println("Установлен новый год выпуска: " + second.getYear());
        System.out.println("Author: " + secondAuthor.getAuthorFirstName() + secondAuthor.getAuthorLastName());


    }
}
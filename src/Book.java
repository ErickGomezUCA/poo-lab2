public class Book {
    private int isbn;
    private String name;
    private String author;
    private int pages;

    public Book(int isbn, String name, String author, int pages){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public static class ISBNGenerator {
        private static long current = 987654;

        public static long generateISBN() {
            return ++current;
        }
    }

}

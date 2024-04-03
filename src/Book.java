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
        this.isbn = ISBNGenerator.generate();
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    // Getters

    public int getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // Setters

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Static class
    public static class ISBNGenerator {
        private static int current = 987654;

        public static int generate() {
            return ++current;
        }
    }

}

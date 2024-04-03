import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    public void showBooks() {
        books.forEach(book -> {
            System.out.println("Book N° " + books.indexOf(book));
            System.out.println(" - ISBN: " + book.getIsbn());
            System.out.println(" - Name: " + book.getName());
            System.out.println(" - Author: " + book.getAuthor());
            System.out.println(" - Pages: " + book.getPages());
            System.out.println("-------------------------------");
        });
    }
}

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
            System.out.println(" - Name: " + book);
        });
    }
}

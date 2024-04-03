public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book(20334993, "Dracula", "Bram Stroker", 101));
        myLibrary.addBook(new Book(467854, "Cien años de soledad", "Gabriel Marquez", 204));
        myLibrary.addBook(new Book("Libro 1", "Author 1", 131));
        myLibrary.addBook(new Book("Libro 2", "Author 2", 646));

        myLibrary.showBooks();
    }
}
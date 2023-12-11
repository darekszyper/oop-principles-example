// Librarian class demonstrating Inheritance and Polymorphism
public class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarian " + name + " borrowing book: " + book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Librarian " + name + " returning book: " + book.getTitle());
    }

    public void borrowBook(Book book, int numberOfBooks) {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Librarian " + name + " borrowing book: " + book.getTitle());
        }
    }
}
// Main class to demonstrate Polymorphism in action
public class LibrarySystem {
    public static void main(String[] args) {
        User librarian = new Librarian("Alice");
        User member = new Member("Bob");

        Librarian librarian2 = new Librarian("Frank");

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Demonstrating Polymorphism
        librarian.borrowBook(book); // Calls Librarian's overridden borrowBook
        member.returnBook(book); // Calls Member's overridden returnBook

        librarian2.borrowBook(book, 3); // Calls Librarian's overloaded borrowBooks
    }
}
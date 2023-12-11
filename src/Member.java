// Member class demonstrating Inheritance and Polymorphism
public class Member implements User {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Member " + name + " borrowing book: " + book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Member " + name + " returning book: " + book.getTitle());
    }
}
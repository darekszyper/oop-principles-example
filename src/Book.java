// Book class demonstrating Encapsulation
public class Book {
    private String title; // Private attribute for Encapsulation
    private String author; // Private attribute for Encapsulation

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Public getters and setters for Encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
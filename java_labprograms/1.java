// Book.java
public class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown Title", "Unknown Author", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        // Using 'this' keyword to refer to instance variables
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("📚 Book Details:");
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : ₹" + this.price);
        System.out.println("-----------------------------------");
    }

    // Main method to test Book class
    public static void main(String[] args) {
        // Creating objects using constructors
        Book defaultBook = new Book();
        Book javaBook = new Book("Learning Java", "James Gosling", 499.99);
        Book pythonBook = new Book("Python Programming", "Guido van Rossum", 599.50);

        // Displaying details
        defaultBook.displayDetails();
        javaBook.displayDetails();
        pythonBook.displayDetails();
    }
}

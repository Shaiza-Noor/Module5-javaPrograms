class Book {
    String title;
    String author;
    int publicationYear;

    // Constructor
    Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println(); // Blank line after each book
    }
}

public class BookApp {
    public static void main(String[] args) {
        Book book0 = new Book("1984", "George Orwell", 1949);
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 1988);

        book0.displayBookInfo();
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}

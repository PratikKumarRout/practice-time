//challenge 1
public class Hello {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.displayDetails("The book", "Tony");
    }
}

class Book {
    void displayDetails(String title, String author) {
        System.out.println("Titile: " + title + " Author: " + author);
    }
}
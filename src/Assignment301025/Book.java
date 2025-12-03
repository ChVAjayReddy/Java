package Assignment301025;

public class Book {
    static String libraryName;
    String title;
    String author;
    void display() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
public static void main(String[] args) {
    libraryName="City Public Library";
    Book book1=new Book();
    Book book2=new Book();
    book1.author="F. Scott Fitzgerald";
    book1.title="The Great Gatsby";
    book2.author="George Orwell";
    book2.title="1984";
    book1.display();
    book2.display();
}
}


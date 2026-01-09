package LibraryManagement;
public class LibrarySystem {
    public static void main(String[] args) {
            Book book = new Book(101, "Java", 1);
            book.getBookDetails();
                 for (int i = 1; i <= 5; i++) {
                        System.out.println("\nTransaction " + i);
                        book.borrowBook();
                        book.returnBook();
        }
    }
}



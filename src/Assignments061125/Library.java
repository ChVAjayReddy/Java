package Assignments061125;

public class Library {
    public static void main(String[] args) {
        LibraryBookManagement b1=new LibraryBookManagement();
        LibraryBookManagement b2=new LibraryBookManagement();
        b1.setBookName("JAVA");
        b1.setBookAuthor("Ajay");
        b1.setBookPrice(200);
            b1.setBookId(1);
            b2.setBookName("JavaScript");
            b2.setBookAuthor("Jay");
            b2.setBookPrice(300);
            b2.setBookId(2);
            System.out.println(b1.getBookDetails());
            System.out.println(b2.getBookDetails());
    }
}

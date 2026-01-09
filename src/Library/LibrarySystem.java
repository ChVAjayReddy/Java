package Library;

public class LibrarySystem {
    public static void main(String[] args){
        Book b1=new Book();
        Book b2=new Book();
        b1.getDetails(1,"Java",5);
        b1.borrowBook();
        b1.returnBook();
        b2.getDetails(2,"JavaScript",1);
        b2.borrowBook();
        b2.borrowBook();
        b2.borrowBook();
        b2.returnBook();
    }
}

public class Book {
    String bookTitle;
    String author;
    int isbn;
    public void addBookDetails(String Title, String authorname, int isbnnum) {
        bookTitle = Title;
        author = authorname;
        isbn = isbnnum;
    }

    public String displayDetails() {
        return "Book Title : " + bookTitle + " Author : " + author + " ISBN : " + isbn;
    }
    public static void main(String[] args) {
        Book book1=new Book();
        book1.addBookDetails("JAVA","AJAY",12345);
        String result=book1.displayDetails();
        System.out.println(result);
    }
}

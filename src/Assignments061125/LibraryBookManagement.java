package Assignments061125;

public class LibraryBookManagement {
    int bookId;
    String bookName;
    String bookAuthor;
    int bookPrice;
    void setBookId(int bookid){
       bookId = bookid;
    }
    void setBookName(String bookname){
        bookName = bookname;

    }
    void setBookAuthor(String bookauthor){
        bookAuthor = bookauthor;
    }
    void setBookPrice(int bookprice){
        bookPrice = bookprice;
    }

    public String getBookDetails() {
        return "Book Name "+bookName+"\nBook Id "+bookId+"\nBook Author "+bookAuthor+"\nBook Price "+bookPrice;
    }
}

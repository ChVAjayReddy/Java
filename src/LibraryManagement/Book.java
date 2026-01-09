package LibraryManagement;

class Book {

    private int bookId;
    private String title;
    private int availableCopies;

    public Book(int bookId, String title, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    // Getter methods
    void  getBookDetails() { System.out.println("Book Details " );
        System.out.println("Book Id :"+this.bookId );
        System.out.println("Title "+title);
        System.out.println("Available Copies "+availableCopies);

    }


   void  borrowBook(){
        System.out.println("Attempting to borrow a book... ");
        if(this.availableCopies==0){
            System.out.println("Book is not available for borrowing. ");

        }
        else{  System.out.println("Book borrowed successfully! Updated Available Copies: "+     --this.availableCopies);}





    }
    void returnBook(){
        System.out.println("Attempting to return a book... ");
        System.out.println("Book returned successfully! Updated Available Copies :"+   ++this.availableCopies);
}}


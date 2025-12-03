public class LightBookTracker {
    String title;
    int pages;
    void displayInfo(){
        System.out.println("Book Title " + title);
        System.out.println("Pages " + pages);
    }
    public static void main(String[] args){
        LightBookTracker e = new LightBookTracker();
        e.title="Java Basics";
        e.pages=120;
        e.displayInfo();


    }
}

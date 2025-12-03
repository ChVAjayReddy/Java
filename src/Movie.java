public class Movie {
    int count;
    void likes()
    {
        count++;
    }
    void display(){
        System.out.println("Hello World Ajay" + count);
    }

    public  static void main(String[] args) {
        Movie m1=new Movie();
        m1.count=0;
        m1.likes();
        m1.display();

    }
}

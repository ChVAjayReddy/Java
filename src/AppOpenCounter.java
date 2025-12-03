public class AppOpenCounter {
    static String name="AJAY REDDY CH V";
    int count;
    void open()
    {
        count++;
    }
    void display()
    {
        System.out.print(count);
    }
    public static  void main(String[] args)
    {
        AppOpenCounter a=new AppOpenCounter();

        a.count=0;
        a.open();
        a.open();
        a.display();
        System.out.println(name);
    }
}

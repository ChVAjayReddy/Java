package Assignment301025;

public class Patient {
    int age;
    String name;
    static String hospitalname;
    void display(){
        System.out.println("Hospital Name: "+hospitalname);
        System.out.println("Name: "+name);

        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        hospitalname=" City Care Hospital";
        Patient p1 = new Patient();

        Patient p2 = new Patient();p1.name="John Deo";
        p1.age=45;

        p1.display();
        p2.name="Emma Watson";
        p2.age=50;
        p2.display();
    }
}

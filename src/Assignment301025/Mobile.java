package Assignment301025;

public class Mobile {
    int price;
    String brand;
    static  String storeName;
    void display(){
        System.out.println("Store Name" + storeName);
        System.out.println("Brand " + brand);
        System.out.println("Price " + price);

    }
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Mobile mobile2 = new Mobile();
        mobile.brand="Apple";
        mobile.price=1200;
        mobile2.brand="Samsung";
        mobile2.price=900;
        storeName="Tech World";
        mobile.display();
        mobile2.display();

    }

}

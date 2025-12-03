package Assignment301025;

public class Car {
    static  String ShowRoomName="Ajay Cars";
    String modelName;
    int price;
    void display()
    {System.out.println("Showroom Name :" +ShowRoomName);
        System.out.println("ModelName:"+modelName);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args){
        Car c1=new Car();
        Car c2=new Car();
        c1.modelName="Tesla Model S";
        c2.modelName="BMW X5";
        c1.price=80000;
        c2.price=75000;
        ShowRoomName="Elite Motors";
        c1.display();
        c2.display();

    }
}

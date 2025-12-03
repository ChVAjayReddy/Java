package Assignent111125;

public class Car {
    String brand;
   float price;

        void display() {
            System.out.println("Car Brand : " + brand +"\nCar Price : " + price);
        }
        public static  void main(String[] args) {
            Car c1=new Car();
            c1.price=75000.5f;
            c1.brand="Tesla";
            c1.display();

        }

}

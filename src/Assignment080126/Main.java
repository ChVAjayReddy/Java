package Assignment080126;
import java.util.Scanner;
class Vehicle {
    String ownerName;
    String vehicleType;
    int vehicleNumber;
    Vehicle(String ownerName, String vehicleType, int vehicleNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
       this.vehicleNumber = vehicleNumber;
    }
}
class ServiceVehicle extends Vehicle{
    String serviceCenterName;
    String serviceCategory;
   ServiceVehicle(String ownerName, String vehicleType, int vehicleNumber,
                   String serviceCenterName, String serviceCategory) {
        super(ownerName, vehicleType, vehicleNumber);
        this.serviceCenterName = serviceCenterName;
        this.serviceCategory = serviceCategory;
        System.out.println("Profile created successfully");
    }
    public void updateServiceCategory(String newServiceCategory){
        if(newServiceCategory==null){
            System.out.println("Please provide valid input");

        }
else{        serviceCategory=newServiceCategory;
    }
}
    public void updateServiceCenter(String newServiceCenter){
        if(newServiceCenter==null){
            System.out.println("Please provide valid input");

        }
        else{        serviceCenterName=newServiceCenter;
        }
    }
    public  void vehicleProfileDetails(){
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Vehicle No: " + this.vehicleNumber);
        System.out.println("Service Center: " +this.serviceCenterName);
        System.out.println("Service Category: " +this.serviceCategory);}
}

public class Main {

    public static void main(String[] args) {

        ServiceVehicle s1 = new ServiceVehicle(
                "Ajay",
                "Bike",
                123,
                "AtoZ Services",
                "General Service"
        );

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println(
                    "Provide a menu:\n" +
                            "1. Update Service Category\n" +
                            "2. Update Service Center Name\n" +
                            "3. View Vehicle Profile Details\n" +
                            "4. Exit\n"
            );

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter new Service Category:");
                    String cat = sc.nextLine();
                    s1.updateServiceCategory(cat);
                    break;

                case 2:
                    System.out.println("Enter new Service Center Name:");
                    String name = sc.nextLine();
                    s1.updateServiceCenter(name);
                    break;

                case 3:
                    s1.vehicleProfileDetails();
                    break;

                case 4:
                    running = false;
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Enter correct choice");
            }
        }
        sc.close();
    }
}

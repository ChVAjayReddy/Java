package Assignments061125;

public class Car {
    int carId;
    String brand;
    String model;
    double rentalPricePerDay;
    void setCarId(int carid) {
       carId = carid;
    }
    void setBrand(String Brand) {
        brand = Brand;
    }
    void setModel(String Model) {
        model = Model;
    }
    void setRentalPricePerDay(double RentalPricePerDay) {
        rentalPricePerDay = RentalPricePerDay;
    }
    String getCarDetails(){
        return " Car Id "+carId+"\n Brand "+brand + " \n Model  " + model + "\n Rental Price Per Day " + rentalPricePerDay;
    }
}

public class Car {
    String carMake;
    String carModel;
    int manufacturingYear;
    public void addCarDetails(String carmake,String carmodel,int manufacturingyear){
        carMake=carmake;
        carModel=carmodel;
        manufacturingYear=manufacturingyear;
    }
    public String displayDetails() {
        return "carMake "+ carMake + " carModel " + carModel + " manufacturingYear " + manufacturingYear;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.addCarDetails("Toyota","Fortuner",2025);
        String result=car.displayDetails();
        System.out.println(result);
    }

}

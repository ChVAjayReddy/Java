package Assignments061125;

public class OnlineShoppingSystem {
    int productId;
    String productName;
    double price;
    int quantity;
    public void setproductId(int id) {
        productId = id;
    }
    public void setproductName(String name) {
        productName = name;
    }
    public void setprice(double Price) {
        price = Price;
    }
    public void setquantity(int Quantity) {
        quantity =Quantity;

    }
    public String getproductId() {
        return " Product Id "+productId;
    }
    public String getproductName() {
        return  "\n Product Name "+productName;
    }
    public String getprice() {
       return  "\n Price "+price;
    }
    public String getquantity() {
        return  "\n Product Quantity "+quantity;

    }


}

public class Product {

    String productName;
    int productId;
    int productPrice;
    public void addProductDetails(String productname, int productid, int productprice) {
        productName = productname;
        productId = productid;
        productPrice = productprice;
    }
    public String displayDetails() {
        return "Product Name: " + productName + ", Product ID: " + productId + ", Product Price: " + productPrice;

    }
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.addProductDetails("Laptop", 1, 50000);
        String result=p1.displayDetails();
        System.out.println(result);
    }
}

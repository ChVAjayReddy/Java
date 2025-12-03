package Assignments061125;

public class ShoppingCart {
    public static  void main(String []args){

    OnlineShoppingSystem p1=new OnlineShoppingSystem();
        OnlineShoppingSystem p2=new OnlineShoppingSystem();
    p1.setproductId(1)  ;

 p1.setquantity(3);
 p1.setprice(50000);
    p1.setproductName("Mobile");p2.setquantity(3);
    p2.setprice(100000);
    p2.setproductName("Tablet");
    p2.setproductId(2);
System.out.println(p1.getproductName()+p1.getproductId()+p1.getquantity()+p1.getprice());
    System.out.println(p2.getproductName()+p2.getproductId()+p2.getquantity()+p2.getprice());}


}

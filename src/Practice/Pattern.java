package Practice;

public class Pattern {
    static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){  System.out.print("* ");}
            System.out.println();
        }
    }
    public  void main(String[] args){
        print(5);
    }
}

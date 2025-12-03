package Assignment181125;

public class largest {
   int largestofthree(int a, int b, int c) {
        if(a>b && a>c) {
            return a;
        }
        else if(b>a && b>c) {
            return b;
        }
        else if(c>a && a>b) {
            return c;
        }
        return -1;
    }
    public static void  main(String[] args) {
      System.out.println(new largest().largestofthree(10,20,30));
    }
}

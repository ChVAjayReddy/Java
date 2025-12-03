package Practice;

public class SumofDigits {
    void sumofDigits(int n)
    {
        int sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        SumofDigits obj=new SumofDigits();
        obj.sumofDigits(101);
        obj.sumofDigits(567);

    }
}

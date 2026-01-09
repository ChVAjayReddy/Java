package Practice;

public class day4 {
    void isequal(int num){
        int last=num%10;
        int first=num;
        while(first>9){
            first/=10;
        }
        int temp=num/10;
        int middleSum=0;
        while(temp>9){
            middleSum+=temp%10;
            temp/=10;
        }
       System.out.println(first+last==middleSum?"Equal":"Not Equal");

    }
    public boolean isless(int num) {
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        int temp = num / 10;
        while (temp >= 10) {
            int digit = temp % 10;
            if (digit >= first || digit >= last) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        day4 obj=new day4();
        obj.isequal(75547);
        obj.isequal(765);
        System.out.println(obj.isless(1672));
        System.out.println(obj.isless(84719));

    }
}

package Practice;
public class Numbers {
    void isstrong(int num){
int sum=0;int temp=num;
while(temp!=0){
int fact=temp%10;
int factvalue=0;
for(int i=0;i<=fact;i++){
    factvalue*=i;
}
sum+=factvalue;
    temp/=10;
}


System.out.println(sum==num?"Strong":"Not Strong");
    }
    public static void main(String[] args){
        Numbers obj=new Numbers();

    }
}

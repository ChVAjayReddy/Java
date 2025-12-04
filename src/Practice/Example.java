package Practice;

public class Example {
    void sumofDigits(int n)
    {
        int sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);

    }
    void reverse(int n)
    {
        int rev=0;
        int temp=n;
        while (temp!=0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        System.out.println(rev);
    }
void factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;

        }
        System.out.println(factorial);
}
void middlechar(String s){
        int length=s.length();
        String result="";
        if(length%2==0){
            result+=s.charAt((length/2)-1);
            result+=s.charAt(length/2);
        }
        else {
            result+=s.charAt(length/2);
        }
        System.out.println(result);
}
void sumofdigitsexcept(int n)
{

    int temp = n;
    int last = temp % 10;
    temp = temp / 10;
    int sumMiddle = 0;

    while (temp > 9) {
        int digit = temp % 10;
        sumMiddle += digit;
        temp = temp / 10;
    }

    int first = temp;

    int sumFirstLast = first + last;

    if (sumFirstLast == sumMiddle)
        System.out.println("equal");
    else
        System.out.println("not equal");


}
void sumoflastfirst(int n){
    int temp = n;


    int last = temp % 10;
    temp = temp / 10;

    boolean isValid = true;

    while (temp > 9) {
        int digit = temp % 10;

        if (digit >= last) {
            isValid = false;
            break;
        }

        temp = temp / 10;
    }


    int first = temp;


    if (isValid && last > 0) {
        temp = n / 10;

        while (temp > 9) {
            int digit = temp % 10;

            if (digit >= first) {
                isValid = false;
                break;
            }

            temp = temp / 10;
        }
    }

    System.out.println(isValid);

}
void vowels(String s){
        String result="";
        for(int i=s.length()-1;i>0;i--){
         char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
             result+=ch;
            }
            System.out.println(result);


        }
}
void vowelonce(String s){
        String result="";
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
              int count=0;
              for(int j=0;j<result.length();j++){
                  if(result.charAt(j)==ch){
                      count++;
                  }

              }
              if(count==0){
                  result+=ch;
              }
           }
       }
       System.out.println(result);
}
void stringchar(String s) {

}
void toggle(String s){
        String res="";
    for (int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);

        if (Character.isUpperCase(ch)) {
            res+=(Character.toLowerCase(ch));
        }
        else if (Character.isLowerCase(ch)) {
            res+=(Character.toUpperCase(ch));
        }


    }
    System.out.println(res);
}
public static void main(String[] args) {
        Example obj=new Example();
        obj.sumofDigits(101);
        obj.sumofDigits(567);
        obj.reverse(721);
        obj.reverse(567);
        obj.factorial(4);
        obj.middlechar("Wonder");
        obj.middlechar("World");
        obj.middlechar("6969");
        obj.sumofdigitsexcept(75547 );
        obj.sumoflastfirst(8567);
        obj.vowels("Helloworld");
        obj.vowels("JackspArrow");
        obj.vowelonce("Helloworld");
        obj.vowelonce("Jacksparrow");
obj.toggle("Ajay");
    }
}

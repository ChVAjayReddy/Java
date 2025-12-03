package Practice;

public class StringProblems {
    void reversestring(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);
    }
    void ispalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            { System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    void countvowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=Character.toUpperCase(s.charAt(i));
            if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    void RemoveVowels(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            char c=Character.toUpperCase(s.charAt(i));
            if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
            {
           str+=s.charAt(i);
            }
        }

        System.out.println(str);
    }
    void TitleCase(String s){
        boolean space=false;String title="";
        for(int i=0;i<s.length();i++){

            if(space==true){
                title+=Character.toUpperCase(s.charAt(i));
                space=false;

            }
            else{
                if(i==0){    title+=Character.toUpperCase(s.charAt(i));

                }
                else if(s.charAt(i)==' '){
                    title+=Character.toUpperCase(s.charAt(i));
                    space=true;
                }
                else{
                    title+=s.charAt(i);
                }

            }
        }
        System.out.println(title);

    }
    void OccurrencesofCharacter(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

    }
    void Stringcontaindigits(String s){
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Flase");
                return ;
            }
        }
        System.out.println("Flase");
    }
    public static  void main(String args[]){
        new StringProblems().reversestring("hello");
        new StringProblems().ispalindrome("racecar");
        new StringProblems().ispalindrome("hello");
        new StringProblems().countvowels("hello world");
        new StringProblems().RemoveVowels("hello world");
        StringProblems obj=new StringProblems();
        obj.TitleCase("hello World");
        obj.OccurrencesofCharacter("hello world",'l');



    }
}

package Practice;

public class uppercase {
    public static  void main(String args[]){

        String name= "NumberOne";
        String res="";String res1="";
        String result="";
        for(char c: name.toCharArray()){
            System.out.println(c);
            if(Character.isUpperCase(c)){
                res+=c;
            }
            else{
                res1+=c;
            }

        }
        for(int i=res.length();i<0;i++){
           result+=res.charAt(i);
        }
        System.out.println(result.concat(res1));

    }
}

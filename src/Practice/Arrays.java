package Practice;

public class Arrays {
    void largest(int[] arr){
        int largest=0;
                for(int x : arr) {
            if(x>largest){
                largest=x;
            }
        }      System.out.println(largest);

        }
        void secondlargest(int[] arr){
            int largest=0;
            for(int x : arr) {
                if(x>largest){
                    largest=x;
                }
            }int diff=0;int secondlargest=0;
            for(int x=0;x<arr.length;x++){
                if(x==0){
               diff=largest-arr[x];
                secondlargest=arr[x];}
                else{

                    if((diff > largest-arr[x]) && (largest-arr[x]!=0)){

                        diff=largest-arr[x];
                        secondlargest=arr[x];
                    }

                }


            }
            System.out.println(secondlargest);

        }
        void sumofelements(int[] arr){
        int sum=0;
        for(int x : arr){
            sum+=x;
        }
        System.out.println(sum);
        }
        void issorted(int[] arr){
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not sorted");
                return;

            }

        }  System.out.println(" sorted");
        }
        void reverser(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            int temp1=arr[arr.length-i-1];
            arr[i]=temp1;
            arr[arr.length-i-1]=temp;

        }
     for(int x: arr){
         System.out.println(x);
     }
        }
        void removefalsy(int[] arr){

        }
        void unique(int[] arr){
        int[] array=new int[5];

        }
        void sumofeven(int[] arr){
        int sum=0;
        for(int x: arr){
            if(x%2==0){
                sum+=x;
            }
        }
        System.out.println(sum);
}

public static void main(String[] args) {
    int[] numbers = {3, 1, 4, 1, 5, 9};
    int[] input={1,2,3,7,4,5,6,8};
    int[] uniquearray={ 1, 2, 2, 3, 4, 4, 5 };
        Arrays obj=new Arrays();
        obj.sumofelements(numbers);
        obj.issorted(input);
        obj.reverser(input);
        obj.sumofeven(uniquearray);
    }
}

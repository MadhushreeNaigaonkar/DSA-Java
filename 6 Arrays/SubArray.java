//Brut force approach
public class SubArray {
     /*
        i/p: 2,3,4,5
        o/p:
        2        sum=2
        2,3      sum=5
        2,3,4    sum=9
        2,3,4,5  sum=14

        3       sum=3
        3,4     sum=7
        3,4,5   sum=12

        4       sum=4
        4,5     sum=9

        max sum= 14
        min sum=2
        */
    public static void subarray(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++)
        { sum=0;
            for(int k=i;k<=j;k++){
               
                System.out.print(arr[k]+" ");
                sum+=arr[k];

            }

            if(sum>max){
                max=sum;
            }
            if(sum<min){
                min=sum;
            }
           
            System.out.println();
        }
        System.out.println();
        

       }
       System.out.println("Max sum is:"+max);//used brutforce approach to calculate max and min
        System.out.println("Min sum is:"+min);

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        subarray(arr);

    }
}

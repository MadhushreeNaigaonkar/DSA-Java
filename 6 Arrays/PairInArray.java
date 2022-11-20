public class PairInArray {

    public static void pairs(int[] arr){
        /*
        I/p: 2,3,4,5,6

        O/P:
         (2,3)(2,4)(2,5)(2,6)
         (3,4)(3,5)(3,6)
         (4,5)(4,6)
         (5,6)
        */
        /* code to find total number of pars with formula
            int n=arr.length;
            int total_pairs=(n(n-1))/2;
            sout(total_pairs);
        */
      int   total_pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total_pairs++;          //total numb of pairs
            }
            System.out.println();
        }

        System.out.println(total_pairs);


    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        pairs(arr);
    }
}

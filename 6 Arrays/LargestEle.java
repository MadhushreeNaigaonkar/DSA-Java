
public class LargestEle {

    public static int largest(int num[]){
        int large=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        return large;

    }
    public static void main(String[] args) {
        int numbers[]={2,1,4,5,22,66,7};
        int l=largest(numbers);
        System.out.println(l);
        
    }
}

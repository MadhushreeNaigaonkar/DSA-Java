

public class SumOfN {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int s = sum(n-1);
        int sum= n+s;
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
}

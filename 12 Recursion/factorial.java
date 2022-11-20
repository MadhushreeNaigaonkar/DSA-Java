

public class factorial {

    public static int fact(int n){
        if( n == 0){
            return 1;
        }
        int fn= fact(n-1);
        int fact=n*fn;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    
}

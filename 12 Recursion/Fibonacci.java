

public class Fibonacci {

    public static int fib(int n){

        if(n==0){
            
            return 0;
        }
        if(n==1){
            
            return 1;
        }
        int fb1=fib(n-1);
        int fb=fib(n-2);
        int fibo=fb+fb1;
        
        return fibo;



    }

    public static void main(String[] args) {
        int a=fib(5);
        System.out.println(a);
    }
}

//Write a Java method to compute the sum of the digits in an integer

public class SumOfDigits {

    public static int sumofdigits(int n){
        int sum=0;
        while(n>0){
            int r = n%10;
            sum=sum+r;
            n=n/10;

        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Sum of digit is"+ sumofdigits(12345));
        
    }
}

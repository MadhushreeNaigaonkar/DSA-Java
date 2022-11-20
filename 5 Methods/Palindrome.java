public class Palindrome {
    /// 1221
    // Oppo

    public static String palindrome(int n){
        // this is for number

        int sum=0;
        int num=n;
        while(n>0){
            int r = n % 10;
            sum = sum*10+r;
            n /=10;
        }
       
        if(sum==num){
            return "Palindrome";
        }
        return " Not Palindrome";

    }

    public static void main(String[] args) {
        
        System.out.println(palindrome(1221));
    }
}

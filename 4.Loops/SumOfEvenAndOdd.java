import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int even=0;
        int odd=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total elements you want");
        int ele=sc.nextInt();
        for(int i=0;i<ele;i++){
        int num=sc.nextInt();
        if(num%2==0){
            even = even+num;
        }else{
            odd=odd+num;
        }
        }
        System.out.println("Sum of Even numb " + even);
        System.out.println("Sum of Odd numb " + odd);
        sc.close();
    }
}

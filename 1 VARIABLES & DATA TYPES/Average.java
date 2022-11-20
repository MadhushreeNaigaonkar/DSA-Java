import java.util.Scanner;

/*Question1: Inaprogram,input3numbers:
            A,BandC.You have to output the average of these 3 numbers.
            (Hint : Average of N numbers is sum of those numbers divided by N)
*/


class Average{
    public static void main(String[] ag){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
         
        int avg=(a+b+c)/3;
        System.out.println(avg);
        sc.close();
    
    }
}

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year=sc.nextInt();

        String res = year%4==0?"Leap Year":"No Leap Year";
        System.out.println(res);
        sc.close();
    }

    
}
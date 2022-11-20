/*Enter cost of 3 items from the user(using float datatype)-
a pencil,a pen and an eraser. You have to output the total cost
of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;

public class Cost {
    public static void main(String[] ag) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 items cost");
        float pencil = sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen+ pencil+eraser;
        System.out.println("Total cost "+total);

        float gst= total+(0.18f * total);
        System.out.println("Total cost with gst "+gst);
        sc.close();

    }   
}

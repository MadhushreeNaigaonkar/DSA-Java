import java.util.ArrayList;
import java.util.Collections;

public class Sort {



    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(10);
        al.add(9);
        al.add(2);
        al.add(8);
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");

        }



    }
}

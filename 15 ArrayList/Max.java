import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(10);
        al.add(9);
        al.add(2);
        al.add(8);
        int max=0;
        for(int i=0;i<al.size();i++){
            max=Math.max(max,al.get(i));
        }
        System.out.println(max);
    }
}

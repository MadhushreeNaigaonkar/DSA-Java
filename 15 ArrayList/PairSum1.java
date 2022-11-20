import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairSum(ArrayList<Integer> al , int target)
    {
        int lp=0;
        int rp=al.size()-1;

        while(lp<rp){
            if(al.get(lp)+al.get(rp)==target){
                return true;
            }
            if(al.get(lp)+al.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println(pairSum(al, 50));
        
    }
}

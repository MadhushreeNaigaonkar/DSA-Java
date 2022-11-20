import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum(ArrayList<Integer> al, int target){
        int bp=-1;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>al.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;

        while(lp!= rp){
            if(al.get(lp)+al.get(rp)==target){
                return true;
            }
            if(al.get(lp)+al.get(rp)<target){
                lp= (lp+1)%al.size();
            }else{
                rp= (al.size()+rp-1)%al.size();
            }

        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(2);

        System.out.println(pairSum(al, 5));
    }


    
}

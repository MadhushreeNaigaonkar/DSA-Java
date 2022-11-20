import java.util.ArrayList;

public class ContainerWithMostWater {

    public static void calculateWater(ArrayList<Integer> height){
        int lp =0;
        int rp= height.size()-1;
        int maxWater=0;

        while(lp<rp){
            int h=Math.min(height.get(lp),height.get(rp));
            int w=rp-lp;
            int currentWater=h*w;
            maxWater = Math.max(maxWater, currentWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        System.out.println(maxWater);
    }


    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        calculateWater(height);
    }
    
}

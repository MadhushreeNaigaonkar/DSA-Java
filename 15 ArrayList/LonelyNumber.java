import java.util.*;

public class LonelyNumber {

    public static void findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)+1<nums.get(1)&& nums.get(i)+1<nums.get(i=1)){
                list.add(nums.get(i));
            }
        }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1<nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));

            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(6);
        al.add(5);
        al.add(8);

        findLonely(al);
    }
}

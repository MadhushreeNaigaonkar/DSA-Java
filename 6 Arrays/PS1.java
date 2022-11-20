import java.util.Arrays;

public class PS1 {
    // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
    public static boolean isDistinct(int nums[]){
        
        //int count=0;

//         for(int i=0; i< nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){

//                 if(nums[i]==nums[j]){
//                     count++;
//                 }

//             }
//         }
//         if(count>0){
//             count=0;
//             return true;
//         }
// return false;

    Arrays.sort(nums);
    int i=1;
    while(i<nums.length-1){
        if(nums[i]==nums[i+1]){
            return true;
        }
        i++;
    }

    return false;

    }


    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,5};
        boolean ans=isDistinct(nums);
        System.out.println(ans);

    }
}

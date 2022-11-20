public class RotatedSortedArray {

    public static int search(int arr[], int target, int si, int ei){
            //Using Recurrsion
            
            if(si>ei){

                return -1;

            }
            
            int mid = si+(ei-si)/2;

            if(arr[mid]== target){
                return mid;

            }

            // Line L1
            if(arr[si]<=arr[mid]){
                //In Left
                if(arr[si]<=target&&target<=arr[mid]){
                    return search(arr,target,si,mid-1);
                }
                else{
                    return search(arr,target,mid+1,ei);
                }
            }
            else{
                 //Line L2
                
                    //L2 right
                    if(arr[mid]<=target && target<=arr[ei]){
                        return search(arr,0,mid+1,ei);
                    } 
                    else{
                        return search(arr, 0, si, mid-1);
                     }
                     
             }
             
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int end= arr.length-1;
        System.out.println(search(arr,target,0,end));
    }
    
}

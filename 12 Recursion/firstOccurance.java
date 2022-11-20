public class firstOccurance {
    public static int firstOcc(int arr[], int n,int i){

        if(i==arr.length-1){
            return -1;
        }   
        if(arr[i]==n){
            return i;
        }

        return firstOcc(arr, n, i+1);
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,6};
        System.out.println(firstOcc(arr,5,0));
    }
}

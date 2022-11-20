

public class lastOccurance {
    public static int lastOcc(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int a=lastOcc(arr, key, i+1);
        if(arr[i]==key && a==-1){
            return i;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={4,4,4,4,4};
        System.out.println(lastOcc(arr,4,0));
    }
    
}

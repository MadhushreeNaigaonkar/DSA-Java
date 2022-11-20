package Sorting;

public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {2,6,7,9,6,1};

        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && min<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
            }
        

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}
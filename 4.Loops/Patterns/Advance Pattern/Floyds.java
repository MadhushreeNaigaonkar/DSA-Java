
public class Floyds {
    /*
        1
        2 3
        4 5 6
        7 8 9 10
    
    */
    public static void floyd(int n){
        int count=1;
        //Outer loop
        for(int i=1;i<=n;i++){
          
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd(4);
        
    }
    
}

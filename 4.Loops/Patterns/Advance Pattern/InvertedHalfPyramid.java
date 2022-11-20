

public class InvertedHalfPyramid {
    /*
        1234
        123
        12
        1
    
    */
    public static void numbpy(int n){
        //Outer
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        numbpy(4);
        
    }
    
}

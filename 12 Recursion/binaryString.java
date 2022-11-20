public class binaryString {
    public static void bstring(int n,int lastPos,String s){
        if ( n == 0) {
            System.out.println(s);   
            return;
            
        }
        
        bstring(n-1, 0, s+"0");
        
        if(lastPos==0){
            bstring(n-1,1, s+"1");
        }
        return;

    }
    public static void main(String[] args) {
        bstring(3,0,"");
    }


}

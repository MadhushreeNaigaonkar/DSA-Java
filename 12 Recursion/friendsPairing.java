public class friendsPairing {

    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        
        int fn1=pairing(n-1);
        int fn2=pairing(n-2)*(n-1);

        int totalWays=fn1+fn2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    
}

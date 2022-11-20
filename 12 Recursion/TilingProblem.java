

public class TilingProblem {
    public static int totalWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        // verical
        int vertical=totalWays(n-1);

        //horizontal
        int horizontal=totalWays(n-2);

        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(totalWays(4));
    }
    
}

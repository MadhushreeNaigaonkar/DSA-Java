public class GridWays {

    public static int gridWays(int row,int col,int n ,int m){
        if(row ==n-1 && col==m-1){
            return 1;
        }else if(row==n || col ==m) return 0;

        //right choice
        int w1=gridWays(row,col+1,n,m);
        //down choice
        int w2=gridWays(row+1,col,n,m);
        return w1+w2;

    }



    public static void main(String[] args) {
        int n=3;int m=3;
        System.out.println(gridWays(0,0, n, m));
    }
    
}

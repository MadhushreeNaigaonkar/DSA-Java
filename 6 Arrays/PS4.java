public class PS4 {
    public static int TrappedWater(int[] height){
        int n=height.length;
        int TrappedWater=0;
        // create MAxleft[]

        int maxLeft[]= new int[n];
        maxLeft[0]=height[0];
        for(int i =1; i<n; i++){
            maxLeft[i]=Math.max(height[i],maxLeft[i-1]);

        }

        //MaxRigth[]

        int MaxRight[] = new int[n];
        MaxRight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            MaxRight[i]=Math.max(MaxRight[i+1], height[i]);
        }

        for(int i=0;i<n;i++){
            int waterlevel = Math.min(MaxRight[i], maxLeft[i]);
            TrappedWater += waterlevel- height[i];
        }

        return TrappedWater;
    }
    public static void main(String[] args) {
        int[] height={4,2,3,6,2,3,5};
        System.out.println(TrappedWater(height));
    }
}

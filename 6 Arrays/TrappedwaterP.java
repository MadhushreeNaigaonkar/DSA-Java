public class TrappedwaterP {
    public static int trappedWater(int height[]){
        int trappedwater=0;
        int n=height.length;
        // create two auxilary array
        int maxLeft[]=new int[n];
        maxLeft[0]=height[0];
        for(int i=1;i<n;i++){
            maxLeft[i]=Math.max(height[i], maxLeft[i-1]);
        }

        int maxRight[]=new int[n];
        maxRight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(height[i], maxRight[i+1]);
        }

        //calculate water level for each height waterlevel = min(leftboun,rightbound)

        for (int i=0;i<n;i++){
            int waterlevel=Math.min(maxLeft[i],maxRight[i]);
            trappedwater += waterlevel-height[i];

        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,3,5,6,3,2,4};
        
       System.out.println(trappedWater(height)); 
    }
    
}

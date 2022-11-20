public class TrappedWater {
    public static int trappesWater(int height[]){
      
        int trappedWater=0;
        int n = height.length;
        //Create Auxilary array MAxLeftBoundry
        int MaxLeftBoundry[] = new int[n];
        //Create Auxilary array MaxRightBoundry
        int MaxRightBoundry[]= new int[n];
        //find Waterlevel where waterlevel[ele]=min(MaxLeaftBoundry[ele],MaxRightBoundry[ele])
        MaxLeftBoundry[0]=height[0];
        for(int i=1;i<n;i++){
            MaxLeftBoundry[i]=Math.max(height[i],MaxLeftBoundry[i-1]);
        }
        MaxRightBoundry[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            MaxRightBoundry[i]=Math.max(height[i],MaxRightBoundry[i+1]);
        }
        //find and add Trapped Water where trappedWater += waterlevel[ele]-height[ele]
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(MaxLeftBoundry[i],MaxRightBoundry[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappesWater(height));
    }
    
}

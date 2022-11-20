

public class PS3 {
    //You  are  given  an  array prices where prices[i] is  the  price  of  a  given  
    //stock  on  the ith day.Return the maximum profit you can achieve from this transaction. 
    //If you cannot achieve any profit, return 0.
    public static int maxProfit(int[] prices){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-maxProfit;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        if(maxProfit !=0){
            return maxProfit;
        }
        return 0;
    }

    public static void main(String[] args) {

        int prices[]={4,3,1,5,6};
        System.out.println(maxProfit(prices));
        
    }
    
}

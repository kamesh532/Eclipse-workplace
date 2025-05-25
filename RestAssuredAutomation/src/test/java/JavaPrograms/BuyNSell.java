package JavaPrograms;

public class BuyNSell {
	
	 public static void main(String[] args) {
	        int[] prices={7,1,5,3,6,4};
	        int profit=maxProfitFirst(prices);
	        System.out.println("1st approach to find profit "+profit);
	        System.out.println("2nd approach to find profit "+profit);
	    }
	 
	 //1st approach
	    public static int maxProfitFirst(int[] prices)
	    {
	        int min=prices[0];
	      int  profit=0;
	        for(int i=0; i<prices.length; i++)
	        {
	            if(prices[i]<min)
	            {
	                min=prices[i];
	            }
	            profit=Math.max(profit,prices[i]-min);
	        }
	        return profit;
	              
	        }
	    
	    //2nd Approach
	    public static int maxProfitSecond(int[] prices)
	    {
	        int minPrice=Integer.MIN_VALUE;
	      int  maxProfit=0;
	      for (int price : prices) {
	          minPrice = Math.min(minPrice, price);           // Track lowest price seen so far
	          maxProfit = Math.max(maxProfit, price - minPrice);
	      }
	        return maxProfit;
	            
	    }

}

// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

public class Stock_Buy_And_Sell {
    static int max_profit(int[] arr){
        int mini=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                mini=Math.max(arr[j]-arr[i], mini);
            }
        }
        if(mini<0) return 0;
        return mini;
    }
    static int maxProfit(int[] prices) {
        int mini=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<mini){
                mini=prices[i];
            }
            profit=Math.max(prices[i]-mini,profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
        System.out.println(max_profit(arr));
        System.out.println(maxProfit(arr));
    }
}

package Questions;

public class Q3 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int temp;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            temp = prices[i] - buyPrice;
            if(temp > maxProfit){
                maxProfit = temp;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,8,7,2,5};
        System.out.println(maxProfit(arr));
    }
}

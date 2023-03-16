package LeetCode.Arrays;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{4,2,5,1}));
    }

    public static int maxProfit(int[] prices) {

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int diff = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            diff = prices[i] - lsf;
            if(op < diff){
                op = diff;
            }
        }
        return op;

    }
}

package LeetCode.Arrays;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int pos = 0;
        for(int i = 1; i < prices.length ;i++) {

            if(min > prices[i]){
                min = prices[i];
                pos = i;
            }

        }

        int max = 0;
        for(int i = pos+1 ; i < prices.length ;i++) {
            if(max < prices[i]){
                max = prices[i];
            }
        }
        if (max == 0) {
            return 0;
        }else {

            return max - min;

        }


    }
}

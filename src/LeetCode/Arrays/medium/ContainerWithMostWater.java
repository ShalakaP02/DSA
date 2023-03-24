package LeetCode.Arrays.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,4,3}));
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = 0;

        while (i < j){

            if(height[i] <= height[j]){
                if(maxWater < ((j-i) * height[i])){
                    maxWater =(j-i) * height[i];
                }
                i++;
            }else {
                if(maxWater < ((j-i) * height[j])){
                    maxWater = (j-i)* height[j];
                }
                j--;
            }

        }
        return maxWater;
    }
}

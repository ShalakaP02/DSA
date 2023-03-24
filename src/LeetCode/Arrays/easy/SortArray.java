package LeetCode.Arrays.easy;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = sortArray(new int[]{5,6,0,2,2,3,4});
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    public static int[] sortArray(int[] nums) {

        for(int i = 0;i< nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }

        return nums;
    }
}

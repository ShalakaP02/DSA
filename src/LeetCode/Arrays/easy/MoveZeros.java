package LeetCode.Arrays.easy;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroesOptimum2(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == 0){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        for(int k = 0 ; k < nums.length ; k++){
            System.out.println(nums[k]);
        }
    }

    public static void moveZeroesOptimum(int[] nums) {

        int i = 0;
        int j = i+1;

        while(j < nums.length){

            if(nums[i]==0 && nums[j] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j++;
            }else if( nums[i]!=0 ) {
                i++;
                j++;
            }else{
                j++;
            }

        }

        for(int k = 0 ; k < nums.length ; k++){
            System.out.println(nums[k]);
        }
    }
    public static void moveZeroesOptimum2(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        for(int k = 0 ; k < nums.length ; k++){
            System.out.println(nums[k]);
        }
    }


}

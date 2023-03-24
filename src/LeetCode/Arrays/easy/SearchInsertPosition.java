package LeetCode.Arrays.easy;


public class SearchInsertPosition {
    public static void main(String[] args) {
        int res =  searchInsert(new int[]{1,3,5,6},3);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        int hi = nums.length;
        int li = 0;
        int eleIndex =  binarySearchInternal(nums,li,hi,target);
        if(eleIndex < 0){
            eleIndex = eleIndex * -1;
        }

        return eleIndex;
    }

    private static int binarySearchInternal(int[] nums, int li, int hi, int target) {
        int low = li;
        int high = hi - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low);

    }


}

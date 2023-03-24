package LeetCode.Arrays.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
//        int[] arr = sortedSquaresJ8(new int[]{-4,-1,0,3,10});
//        for (int i: arr) {
//            System.out.print(i+" ");
//        }

        int[] arr = sortedSquares(new int[]{0,2});
        for (int i: arr) {
            System.out.print(i+" ");
        }

    }
    //  {-4,-1,0,3,10}
    //   0 0 0 0 10 j--
    //   0 0 0 -4 10  i++
    //

    public static int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];

        int j = nums.length-1;
        int i = 0;
        int k = j;


        while(nums[i] < 0 && i != j){
            int tmp = nums[i] * -1;
            if(tmp <= nums[j]){
                newArray[k] = nums[j];
                newArray[k] = newArray[k] * newArray[k];
                j--;
                k--;
            }else if(tmp > nums[j]){
                newArray[k] = tmp;
                newArray[k] = newArray[k] * newArray[k];
                i++;
                k--;
            }
        }

        while(i <= j){
            newArray[k] = nums[j];
            newArray[k] = newArray[k] * newArray[k];
            k--;
            j--;
        }
        return newArray;

    }


    public static int[] sortedSquaresRecommended(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i=0, j=n-1;

        for (int p=n-1; p>=0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[p] = nums[i]*nums[i];
                i++;
            } else {
                res[p] = nums[j]*nums[j];
                j--;
            }
        }

        return res;
    }


    // Java 8
    public static int[] sortedSquaresJ8(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().map(e -> e * e).sorted().collect(Collectors.toList());

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

}

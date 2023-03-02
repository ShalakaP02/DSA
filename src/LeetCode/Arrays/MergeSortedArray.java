package LeetCode.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,5,0,0,0},3,new int[]{2,3,4},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{

                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }


    }
}

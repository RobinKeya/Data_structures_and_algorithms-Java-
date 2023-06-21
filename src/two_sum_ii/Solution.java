package two_sum_ii;

import java.util.Arrays;

//two sum problem but with input now sorted.
public class Solution {
    private int[] twoSum(int[] A, int target){
        int left = 0, right = A.length-1;
        while (left< right){
            if (A[left]+ A[right]== target){
                return new int[]{left+1,right+1};
            } else if (A[left]+ A[right]>target) {
                right--;
            } else {
                left++;
            }
        }
        throw new IllegalArgumentException("No such two elements can be found");
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] testData = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(obj.twoSum(testData,7)));
    }
}

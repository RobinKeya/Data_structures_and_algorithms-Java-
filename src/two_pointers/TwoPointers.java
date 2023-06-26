package two_pointers;

import kadanes_algorithm.Kadane;

import java.util.Arrays;

public class TwoPointers {
    private int[] indexOfFirstAndLastMaxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int left=0, maxL = 0, maxR=0, currSum =0;
        for (int i=0; i< nums.length;i++){
            if (currSum < 0){
                currSum =0;
                left =i;
            }
            currSum +=nums[i];
            if (currSum> maxSum){
                maxSum = currSum;
                maxL = left;
                maxR= i;
            }
        }
        return new int[]{maxL,maxR};
    }

    public static void main(String[] args){
        TwoPointers obj = new TwoPointers();
        System.out.println(Arrays.toString(obj.indexOfFirstAndLastMaxSubArray(new int[]{5,-1,2,-7,3,4})));
    }
}

package two_sum;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers, find two numbers such that they add up to a specific target
//number.

//return non 0 based index array
public class Solution {
    private int[] twoSum(int[] A, int target){
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i=0; i< A.length; i++){
            int num = A[i];
            if (complements.containsKey(num)){
                return new int[]{complements.get(num)+1, i+1};
            }else {
                complements.put(target-num, i);
            }
        }
        throw new IllegalArgumentException("No such elements exists");
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] testData = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(obj.twoSum(testData,6)));
    }
}

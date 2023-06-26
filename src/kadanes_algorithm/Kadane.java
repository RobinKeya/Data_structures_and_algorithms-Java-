package kadanes_algorithm;

public class Kadane {
    // [5,-1,2,-7,3,4]==>7
    private int findMaxSum(int[] nums){
        int maxSum = nums[0];
        int currSum =0;

        for (int i=0; i< nums.length; i++){
            currSum = Math.max(currSum,0);
            currSum +=nums[i];
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        Kadane obj = new Kadane();
        System.out.println(obj.findMaxSum(new int[]{5,-1,2,-7,3,4}));
    }
}

package EPI.searching;
//write a method to find both min and max concurrently.
public class MinMax {
    private static Number findMinMax(int[]nums){
        if (nums.length == 1){
            return new Number(nums[0],nums[0]);
        } else if (nums.length < 1) {
            return new Number(-1,-1);
        }
        int max =nums[0];
        int min =nums[0];
        for (int i =0; i< nums.length; i++){
            if (nums[i]> max) max = nums[i];
            if (nums[i]< min) min = nums[i];
        }
        return new Number(min,max);
    }
    public static void main(String[] args){
        Number result = findMinMax(new int[]{3,2,5,1,2,4});
        System.out.println("Max"+ result.max +" min"+ result.min);
    }
}
class Number{
    public int min;
    public int max;
    public Number(int min, int max){
        this.max = max;
        this.min = min;
    }
}

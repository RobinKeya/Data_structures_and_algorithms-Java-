package findDuplicateNumber;
//given an integer array of nums containing n + 1 element, find duplicate number considering array elements ranges [1,n]

public class FindDuplicateNumber {
    private static int findDuplicateNumber(int[] nums){
        int xOrArrValue=0;
        int xOrCountValue=0;
        for(int i =0; i< nums.length; i++){
            if(i +1 < nums.length){
                if ((nums[i] ^ nums[i+1])==0) return nums[i];
            }
            xOrArrValue ^= nums[i];
            xOrCountValue ^= i;
        }
        return xOrArrValue ^ xOrCountValue;
    }
    public static void main(String[] args){
        System.out.println(findDuplicateNumber(new int[]{1,3,2,4,2}));
        System.out.println(findDuplicateNumber(new int[]{2,2,2,2}));
    }
}

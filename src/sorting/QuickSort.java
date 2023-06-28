package sorting;

public class QuickSort {
    private void quickSort(int[] nums){
        quickSort(nums, 0, nums.length-1);
    }
    private void quickSort(int[]nums, int left, int right){
        if(left >= right)return;;

        int pivot = nums[(left+right)/2];
        int index = partition(nums, left, right, pivot);

        quickSort(nums, left, index-1);
        quickSort(nums,index, right);

        System.out.print(nums.length);
    }
    private int partition(int[]nums, int left, int right, int pivot){
        while (left <= right){

            while (nums[left]< pivot){
                left++;
            }

            while (nums[right]< pivot){
                right--;
            }

            if (left <= right){
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    private void swap(int[]nums, int left, int right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]= temp;
    }

    public static void main(String[] args){
        QuickSort obj = new QuickSort();
        obj.quickSort(new int[]{3,1,5,2,8,5,11,7});
    }
}

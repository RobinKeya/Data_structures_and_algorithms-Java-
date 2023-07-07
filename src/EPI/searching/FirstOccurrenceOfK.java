package EPI.searching;

import java.util.ArrayList;
import java.util.List;

//given a sorted array and key element, search for the first occurrence of k
public class FirstOccurrenceOfK {
    private static int searchFirstOccurrence(List<Integer> nums, int key){
        int left=0, right = nums.size()-1, result =-1;
        while (left <= right){
            int mid = left + (right -left)/2;
            if (nums.get(mid)> key){
                right = mid -1;
            } else if (nums.get(mid)== key) {
                right = mid-1;
                result = mid;
            }else {
                left = mid +1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(-14);
        list.add(-10);
        list.add(2);
        list.add(108);
        list.add(108);
        list.add(243);
        list.add(285);
        list.add(285);
        list.add(285);
        list.add(400);
        System.out.println(searchFirstOccurrence(list, 108));
        System.out.println(searchFirstOccurrence(list, 285));
    }
}

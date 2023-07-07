package EPI.searching;

import java.util.ArrayList;
import java.util.List;

public class SearchEntryEqualToIndex {
    private static int searchEntryEqualToIndex(List<Integer> list){
        int left =0, right = list.size();
        int result =-1;
        while (left<= right){
            int mid = left + (right -left)/2;
            if (list.get(mid) > mid){
                right = mid-1;
            } else if (list.get(mid)== mid) {
                return mid;
            }else {
                left = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(searchEntryEqualToIndex(list));
    }
}

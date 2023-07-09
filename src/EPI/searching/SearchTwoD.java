package EPI.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//given a sorted two D array of integers, search for an item. O(m+n);
public class SearchTwoD {
    private static boolean searchTwoD(List<List<Integer>> list, int x){
        int row =0, col = list.get(0).size()-1;
        while (row < list.size() && col >= 0){
            if (list.get(row).get(col)== x) return true;
            else if (list.get(row).get(col)< x) {
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[]args){
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(-1,2,4,4,6),
                Arrays.asList(1,5,5,9,21),
                Arrays.asList(3,6,6,9,22),
                Arrays.asList(3,6,8,10,24),
                Arrays.asList(6,8,9,12,25),
                Arrays.asList(8,10,12,13,40)
        );
        System.out.println(searchTwoD(arr, 8));

    }
}

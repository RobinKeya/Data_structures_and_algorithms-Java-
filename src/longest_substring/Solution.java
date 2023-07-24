package longest_substring;

import java.util.HashSet;

//function that returns the length of the longest substring without repeating characters
public class Solution {
    private static int longestSubstring(String str){
        int result = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int n = str.length();
        for (int i = 0; i< n;i++){
            while (set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            result = Math.max(result, i-left+1);
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println(longestSubstring("abcabdfc"));
    }
}

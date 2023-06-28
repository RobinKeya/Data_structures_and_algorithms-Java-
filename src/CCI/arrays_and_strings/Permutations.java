package CCI.arrays_and_strings;

import java.util.Arrays;

//given two strings, write function to determine if they're a permutation of each other.
public class Permutations {
    // first solution --> O(n logn) time, O(1) space but sorting can take additional space.
    private static boolean isPermutation(String first, String second){
        if (first.length() != second.length()) return false;
        return sort(first).equals(sort(second));
    }
    private static String sort(String str){
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        return Arrays.toString(strChars);
    }
    //solution two
    //assumptions, ascii string, with 127 unique characters
    //small letters
    // time : O(n), space: O(1);
    private static boolean isPermutationTwo(String first, String second){
        if (first.length() != second.length()) return false;
        int[] chars = new int[127];
        for (int i =0; i< first.length(); i++ ){
            int x = first.charAt(i)-'a';
            int y = second.charAt(i)-'a';

            chars[x]++;
            chars[y]--;
        }
        for (int i : chars){
            if (i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print(isPermutation("first", "first"));
        System.out.print(isPermutationTwo("first", "first"));
    }
}

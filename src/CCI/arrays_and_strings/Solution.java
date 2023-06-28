package CCI.arrays_and_strings;

import java.util.HashSet;

public class Solution {
    //solution one
    private static boolean isUnique(String str){
        HashSet<Character> set = new HashSet<>();
        for (int i =0; i< str.length();i++){
            if (set.contains(str.charAt(i)))return false;
            else {
                set.add(str.charAt(i));
            }
        }
        return true;
    }

    //solution two
    private static boolean isUniqueTwo(String str){
        if (str.length()> 127) return false;
        boolean[] chars = new boolean[127];
        for (int i = 0; i< str.length();i++){
            int value = str.charAt(i)-'a';
            if (chars[value]==true)return false;
            else
                chars[value]=true;
        }
        return true;
    }
    //follow up:: -> what if no additional data structure can be used

    private static boolean isUniqueThree(String str){
        for (int i =0; i< str.length(); i++){
            for (int j =i+1; j< str.length();j++ ){
                if (str.charAt(i)==str.charAt(j))return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print(isUnique("abcdefgha"));
        System.out.print(isUniqueTwo("abcdefgha"));
        System.out.print(isUniqueThree("abcdefgha"));
    }
}

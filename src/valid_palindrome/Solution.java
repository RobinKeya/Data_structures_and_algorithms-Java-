package valid_palindrome;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters
//and ignoring cases.
public class Solution {
    private boolean isPalindrome(String str){
        if (str.isEmpty()) return  true;
        int left =0, right = str.length()-1;

        while (left< right){
            if (!Character.isLetterOrDigit(str.charAt(left))) left++;
            else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome("A a man, a plan, a canal: Panama a      "));
    }
}

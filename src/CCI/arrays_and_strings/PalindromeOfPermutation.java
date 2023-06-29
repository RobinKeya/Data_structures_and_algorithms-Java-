package CCI.arrays_and_strings;
public class PalindromeOfPermutation {

    private static boolean isPalindromeOfPermutation(String str){
        boolean isOdd = false;
        int[] chars = new int[127];
        for (int i =0; i< str.length(); i++){
            if (Character.isLetterOrDigit(str.charAt(i))){
                int charInt =Character.toLowerCase(str.charAt(i))-'a';
                chars[charInt]++;
            }
        }
        for (int i = 0; i< chars.length; i++){
            if (chars[i]%2 == 1 && isOdd){
                return false;
            }else if (chars[i]%2==1){
                isOdd = true;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(isPalindromeOfPermutation("Tact coa"));
    }
}

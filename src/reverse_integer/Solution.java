package reverse_integer;

public class Solution {
    private int reverseInteger(int n){
        int result =0;
        while (n!=0){
            if (result > Math.pow(2,31)){
                return 0;
            }
            result = result * 10 + n%10;
            n /=10;
        }
        return result;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        System.out.println(obj.reverseInteger(-123));
    }
}

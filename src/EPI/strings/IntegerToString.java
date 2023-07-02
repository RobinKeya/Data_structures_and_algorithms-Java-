package EPI.strings;
// write method to convert strings to integer and vice versa.
public class IntegerToString {
    public static int stringToInt(String str){
        int result =0;
        for (int i= (str.charAt(0)=='-')?1: 0; i< str.length(); i++){
            int digit = str.charAt(i)-'0';
            result = result * 10 + digit;
        }
        return str.charAt(0)=='-'? -1*result : result;
    }
    private static String intToString(int n){
        StringBuilder result = new StringBuilder();
        boolean isNegative = false;
        if (n< 0){
            isNegative = true;
            n = n * -1;
        }
        do {
            int digit = n% 10;
            result.append(digit);
            n /= 10;
        }while (n !=0);
        if (isNegative){
            result.append("-");
        }
        return result.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(intToString(-124));
        //System.out.println(stringToInt("124"));
    }
}
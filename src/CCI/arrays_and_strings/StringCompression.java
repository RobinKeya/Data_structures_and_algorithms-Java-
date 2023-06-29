package CCI.arrays_and_strings;

public class StringCompression {
    private static String compressString(String str){
        StringBuilder results = new StringBuilder();
        int count =1;
        for (int i = 1; i< str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            }else {
                results.append(str.charAt(i - 1));
                results.append(count);
                count =1;
            }
        }
        return results.toString().length() < str.length() ? results.toString() : str ;
    }

    public static void main(String[] args){
        System.out.print(compressString("aabccccc"));
    }
}


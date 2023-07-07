package CCI.arrays_and_strings;

public class StringCompression {
    private static String compressString(String str){
        StringBuilder results = new StringBuilder();
        int count =0;
        for (int i =0; i< str.length();i++){
            count++;
            if (i + 1 >= str.length() || str.charAt(i)!=str.charAt(i+1)){
                results.append(str.charAt(i));
                results.append(count);
                count = 0;
            }
        }
        return results.toString().length() < str.length() ? results.toString() : str;
    }

    public static void main(String[] args){
        System.out.print(compressString("aabcccccaaa"));
    }
}


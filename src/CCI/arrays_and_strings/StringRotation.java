package CCI.arrays_and_strings;

public class StringRotation {
    private static boolean stringRotation(String s1, String s2){
        int len = s1.length();
        if (len == s2.length() && len > 0){
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }
    private static boolean isSubstring(String str1, String s2){
        //todo--> check how one string can be a substring of another string.
        return true;
    }
}

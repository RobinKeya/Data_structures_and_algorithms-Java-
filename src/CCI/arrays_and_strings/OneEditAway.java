package CCI.arrays_and_strings;

public class OneEditAway {
    private static boolean oneEditAway(String first, String second){
        if (first.length() == second.length()){
            return oneEditReplace(first,second);
        } else if (first.length() +1 == second.length()) {
            return oneInsertAway(first, second);
        } else if (first.length()-1== second.length()) {
            return oneInsertAway(second, first);
        }else
            return false;
    }

    private static boolean oneEditReplace(String s1, String s2){
        boolean diff = false;
        for (int i =0; i< s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (diff) return false;
            }
            diff = true;
        }
        return true;
    }

    private static boolean oneInsertAway(String s1, String s2){
        int index1 =0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()){
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2 ++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print(oneEditAway("pale","bale"));
        System.out.print(oneEditAway("aple","apple"));
        System.out.print(oneEditAway("pales","pale"));
        System.out.print(oneEditAway("pale","bake"));
    }
}

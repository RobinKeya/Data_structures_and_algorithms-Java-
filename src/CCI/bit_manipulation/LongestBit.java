package CCI.bit_manipulation;
//method to return the longest sequence of 1s after shifting only one bit from 0 to 1;
public class LongestBit {
    private static int longestSetBit(int a){
        //sequence of 1s
        if (~a == 0) return Integer.BYTES *8;
        int currentLength = 0;
        int previousLength =0;
        int maxLength =1;

        while (a != 0){
            if((a & 1) ==1){
                currentLength++;
            }else {
                previousLength = ((a & 2) ==0) ? 0 : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength+1, maxLength);

            a >>>= 1;
        }
        return maxLength;
    }
    public static void main(String[] args){
        System.out.print(longestSetBit(31));
    }
}

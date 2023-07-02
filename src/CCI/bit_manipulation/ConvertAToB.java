package CCI.bit_manipulation;

//number of bits you would need to flip from int A to int B
public class ConvertAToB {
    private static int bitsToFlip(int A, int B){
        int norResults = A ^ B;
        int count=0;
        while (norResults != 0){
            if ((norResults & 1) == 1){
                count++;
            }
            norResults >>=1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print(bitsToFlip(29,15));
    }
}

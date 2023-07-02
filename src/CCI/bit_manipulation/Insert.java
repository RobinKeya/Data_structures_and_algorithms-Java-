package CCI.bit_manipulation;
///given two 32-bit integers, M and N, write code to insert M into N starting from j to i
public class Insert {
    private static int insertMToN(int N, int M, int j, int i){
        int left = -1 << j;
        int right = (1 << i)-1;
        int mask = left | right;
        int m_shifted = M << i;

        return (N & mask) | m_shifted;
    }
    public static void main(String[]args){
        System.out.print(insertMToN(29,7,4,1));
    }
}

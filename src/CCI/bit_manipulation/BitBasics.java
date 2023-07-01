package CCI.bit_manipulation;

public class BitBasics {
    // get bit at position i
    private int getBit(int n, int i){
       return ((n & (1 << i)) != 0) ?  1: 0;
    }
    //set bit
    private void setBit(int n, int i){
        int i1 = n | (1 << i);
    }
    //clear bit
    //update bit
    private void updateBit(int n, int i, byte x){
       int mask = ~(1<< i);

       int result = (n & mask) | (x<< i);
    }

    private void clearBitI(int n, int i){
        int mask = ~(1<< i);
        int result = n & mask;
    }

    private void clearFromMSBToI(int n, int i){
        int mask = (1<<i)-1;
        int result = n & mask;
    }
    private void clearFromLSBToI(int n, int i){
        int mask = (-1<< i+1 );
        int result = n & mask;
    }
}

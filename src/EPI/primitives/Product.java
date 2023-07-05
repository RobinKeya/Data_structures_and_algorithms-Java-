package EPI.primitives;

public class Product {
    private static long multiply(long x, long y){
        long sum = 0;
        while (y !=0){
            if ((y&1) !=0){
               sum = add(sum, x);
            }
            x = x <<1;
            y = y>>>1;
        }
        return sum;
    }
    private static long add( long x, long y){
        while (y !=0){
            long temp = (x& y)<<1;
            x = x ^ y;
            y = temp;
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println(multiply(13,9));
    }
}

package EPI.searching;
//write program that takes an integer and returns the largest integer whose square is less or equal to input number.
public class SquareRoot {
    private static int squareRoot(int n){
        long left =0, right = n;
        while (left <= right){
            long mid = left + (right -left)/2;
            long square = mid * mid;
            if (square<= n){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return (int) left-1;
    }
    public static void main(String[] args){
        System.out.println(squareRoot(16));
        System.out.println(squareRoot(300));
    }
}

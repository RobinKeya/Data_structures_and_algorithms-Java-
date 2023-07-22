package CCI.recursion_dynamic_programming;

public class Fibonacci {
    private static int fibonacci(int n){
        if (n ==0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    private static int fibonacciMemoization(int n){
        return fibonacciMemoization(n, new int[n+1]);
    }
    private static int fibonacciMemoization(int i , int[] memo){
        if (i == 0 || i ==1) return i;
        if (memo[i]==0){
            memo[i]= fibonacciMemoization(i-1, memo)+ fibonacciMemoization(i-2, memo);
        }
        return memo[i];
    }

    private static int fibonacciDP(int n){
        if (n == 0) return 0;
        int[] memo = new int[n];
        memo[0]=0;
        memo[1]= 1;
        for (int i =2; i< n; i++){
            memo[i]= memo[i-2]+ memo[i-2];
        }
        return memo[n-1]+ memo[n-2];
    }
    private static int fibonacciDPV2(int n){
        if (n == 0) return 0;
        int a =0;
        int b = 1;
        for (int i =2; i< n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return a+b;
    }
    public static void main(String[]args){
        //System.out.println(fibonacci(38));
        //System.out.println(fibonacciMemoization(20));
    }
}

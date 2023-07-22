package CCI.recursion_dynamic_programming;
// child running up a staircase can either hop 1, 2, or 3 staircases at a time. Count how many possible ways the child
//can run up the stairs.
public class TripleSteps {
    public static int countWays(int n){
        if (n < 0) return 0;
        if (n == 0) return 1;
        return countWays(n-1)+ countWays(n-2)+ countWays(n-3);
    }
    private static int countWaysMemo(int n){
        int[] memo = new int[n+1];
        return countWaysMemo(n, memo);
    }
    private static int countWaysMemo(int i, int[] memo){
        if (i == 0) return 1;
        if (i< 0) return 0;
        if (memo[i]==0){
            memo[i] = countWaysMemo(i-1, memo) + countWaysMemo(i-2, memo) + countWaysMemo(i-3, memo);
        }
        return memo[i];
    }
    public static void main(String[]args){
        System.out.println(countWays(7));
        System.out.println(countWaysMemo(7));
    }
}

package CCI.bit_manipulation;

//add two numbers without using arithmetic operators
public class AddNumbers {
    private static int addTwoNumbers(int a, int b){
        while (b!=0){
            int temp =(a & b)<<1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.print(addTwoNumbers(11,7));
    }
}

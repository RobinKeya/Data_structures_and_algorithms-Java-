package CCI.moderate;

import java.util.Stack;

//given an arithmetic equation consisting of positve integers,+,-,*,and / ( no parenthesis) compute the result
public class Calculator {
    private static double calculateResult(String str){
        Stack stack = new Stack();
        double result = 0.0;
        int n = str.length();
        for (int i =0; i< n; i++){
            switch (str.charAt(i)){
                case '*':
                    double res =(double) stack.pop() * (str.charAt(i+1)-'0');
                    stack.push(res);
                    i++;
                    break;
                case '/':
                    double divRes =(double) stack.pop()/(str.charAt(i+1)-'0');
                    stack.push(divRes);
                    i++;
                    break;
                case '+':
                    stack.push((char)'+');
                    break;
                case '-':
                    stack.push((char)'-');
                    break;
                default:

                    stack.push((double)str.charAt(i)-'0');
                    System.out.print(stack.peek());
            }
        }
        while (stack.size()>=2){
            double i = (double)stack.pop();
            char op = (char)stack.pop();
            double j = (double) stack.pop();

            if (op =='+'){
                result += i + j;
                stack.push(result);
            }else
                result += j-i;
            stack.push(result);
        }
        return result;
    }
    public static void main(String[]args){
        System.out.print(calculateResult("2*3+5/6*3+5"));
    }
}

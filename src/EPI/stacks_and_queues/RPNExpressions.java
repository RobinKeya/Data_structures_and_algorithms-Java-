package EPI.stacks_and_queues;

import java.util.Stack;

public class RPNExpressions {
    private static int rpnExpressions(String str){
        Stack<Integer> stack = new Stack<>();
        int result =0;
        for (int i=0; i< str.length(); i++){
            if (str.charAt(i)==',')continue;
            else if (Character.isDigit(str.charAt(i))){
                stack.push(str.charAt(i)-'0');
            }else{
                switch (str.charAt(i)){
                    case '+':
                        result = stack.pop() + stack.pop();
                        stack.push(result);
                        break;
                    case 'x':
                        result = stack.pop() * stack.pop();
                        stack.push(result);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(rpnExpressions("3,4,+,2,x,1,+"));
    }
}

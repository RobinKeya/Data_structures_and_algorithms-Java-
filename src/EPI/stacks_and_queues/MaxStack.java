package EPI.stacks_and_queues;

import java.util.Stack;

//stack with a max api
public class MaxStack extends Stack<Integer> {
    Stack<Integer> stack;
    public MaxStack(){
        stack = new Stack<>();
    }
    public Integer pop(){
        int item = super.pop();
        if (item == max()){
            stack.pop();
        }
        return item;
    }
    public void push(int item){
        if (item >= max()){
            stack.push(item);
        }
        super.push(item);
    }
    private int max(){
        if (stack.isEmpty())return Integer.MIN_VALUE;
        return stack.peek();
    }
}

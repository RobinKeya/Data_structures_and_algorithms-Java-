package CCI.stacks_and_queues;
import java.util.Stack;

public class MinStack extends Stack<Integer> {

    Stack<Integer> stack2;

    public MinStack(){
        stack2 = new Stack<>();
    }

    private void push(int item){
        if (item <= min()){
            stack2.push(item);
        }
        super.push(item);
    }
    public Integer pop(){
        int item = super.pop();
        if (item == min()){
            stack2.pop();
        }
        return item;
    }

    private int min(){
        if (stack2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return stack2.peek();
    }
}

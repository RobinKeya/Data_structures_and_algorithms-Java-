package CCI.stacks_and_queues;


import java.util.Stack;

//queue implementation using two stacks
public class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    public MyQueue(){
        first = new Stack<>();
        second = new Stack<>();
    }

    private int size(){
       return first.size() + second.size();
    }
    private int peek(){
       return second.peek();
    }
    private void add(int item){
        first.push(item);
    }
    private int remove(){
        shiftStack();
        return second.pop();
    }

    private void shiftStack(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
    }
}

package CCI.stacks_and_queues;

import java.util.EmptyStackException;

public class Stack<T> {
    private class StackNode<T>{
        T data;
        StackNode<T> next;
        public StackNode(T data){
            this.data = data;
        }
    }
    private StackNode<T> top;

    private boolean isEmpty(){
        return top == null;
    }
    private T peek(){
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    private void push(T item){
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    private T pop(){
        if (top== null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
}

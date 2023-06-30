package CCI.stacks_and_queues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }
    private QueueNode<T> head;
    private QueueNode<T> tail;

    private boolean isEmpty(){
        return head == null;
    }
    private T peek(){
        if (head == null) throw new NoSuchElementException();
        return head.data;
    }

    private void add(T item){
        QueueNode t = new QueueNode(item);
        if (tail != null){
            tail.next = t;
        }
        tail = t;
        if (head == null){
            head = tail;
        }
    }
    private T remove(){
        if (head == null) throw new NoSuchElementException();
        T item = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return item;
    }
}

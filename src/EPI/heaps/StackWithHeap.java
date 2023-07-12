package EPI.heaps;

import java.util.*;

// implement a stack using a head data structure.
public class StackWithHeap {
    static int timeStamp =0;
    static PriorityQueue<StackValue> maxHeap =new PriorityQueue<>((o1, o2) -> Integer.compare(o2.timeStamp, o1.timeStamp));
    private static int pop() throws NoSuchElementException {
        return Objects.requireNonNull(maxHeap.poll()).value;
    }
    private static void push(int value){
        maxHeap.add(new StackValue(value,timeStamp++));
    }
    private static int peek(){
        assert maxHeap.peek() != null;
        return maxHeap.peek().value;
    }
}
class StackValue{
    int value;
    int timeStamp;
    public StackValue(int value, int timeStamp){
        this.value = value;
        this.timeStamp = timeStamp;
    }
}

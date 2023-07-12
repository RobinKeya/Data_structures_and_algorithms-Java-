package EPI.heaps;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

//build a queue using a heap
public class Queue {
    static int timeStamp = 0;
    static PriorityQueue<QueueValue> minHeap = new PriorityQueue<>((a, b)->a.rank-b.rank);
    private static void enqueue(int item){
        minHeap.add(new QueueValue(item, timeStamp++));
    }
    private static int dequeue() throws NoSuchElementException {
        if (minHeap.size() == 0)throw new NoSuchElementException();
        return minHeap.poll().value;
    }
    private static int peek(){
        return minHeap.peek().value;
    }
}
class QueueValue{
    int value;
    int rank;
    public QueueValue(int value, int rank){
        this.value = value;
        this.rank = rank;
    }
}

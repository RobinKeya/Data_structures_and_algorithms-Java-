package EPI.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//return the longest k strings from a stream of strings
public class KLongestStrings {
    private static ArrayList<String> topKStrings(int k, Iterator<String> iterator){
        PriorityQueue<String> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(String::length));
        while (iterator.hasNext()){
            minHeap.add(iterator.next());
            if (minHeap.size()> k){
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}

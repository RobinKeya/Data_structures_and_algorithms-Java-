package EPI.heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    private static void iteratorTest(List<Integer> iter){
        Iterator<Integer> result = iter.iterator();
        while (result.hasNext()){
            System.out.println(result.next());
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        iteratorTest(list);
    }
}

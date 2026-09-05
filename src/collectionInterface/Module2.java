package collectionInterface;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class Module2 {
    public static void main(String[] args) {
//        Queue<Integer> line1 = new LinkedBlockingDeque<>();
//        line1.offer(12);
//        line1.offer(34);
//        line1.offer(56);
//        line1.offer(78);
//
//        System.out.println(line1);
//
//        System.out.println("Removing: " + line1.poll());
//
//        System.out.println("Taking a peek on head os the queue: " + line1.peek());
//
//        System.out.println(line1);

//        Queue<Integer> pq = new PriorityQueue<>();
        //def behavior -> Int -> less val -> high priority -> minHeap
        //maxHeap -> (a,b)->b-a
//        pq.offer(98);
//        pq.offer(87);
//        pq.offer(12);
//        pq.offer(65);
//        System.out.println(pq);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(21);
        set1.add(34);
        set1.add(36);
        set1.add(45);

        set2.add(21);
        set2.add(35);
        set2.add(32);
        set2.add(45);

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);

    }
}

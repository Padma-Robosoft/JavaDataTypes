package PracticePrograms;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(30);
        pq.offer(55);
        pq.offer(20);
        pq.offer(90);
        System.out.println(pq);
        System.out.println(pq.poll()+" has been removed");
        System.out.println("the elements in the queue is: "+pq);
        System.out.println(pq.peek()+" the peek element");

    }
}

package PracticePrograms;
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offerFirst(5);
        adq.offerLast(15);
        adq.offerLast(20);
        adq.offer(25);
        System.out.println("The elements in the Array Deque is: "+adq);

        System.out.println("The peek element is: "+adq.peek());
        System.out.println("The First peek element is: "+adq.peekFirst());
        System.out.println("The last peek element is: "+adq.peekLast());

        System.out.println("The poll element "+adq.poll());
        System.out.println("After poll() "+adq);

        System.out.println("The first poll element "+adq.pollFirst());
        System.out.println("After Poll() first element: "+adq);

        System.out.println("The last poll element "+adq.pollLast());
        System.out.println("After Poll() last element: "+adq);
    }
}

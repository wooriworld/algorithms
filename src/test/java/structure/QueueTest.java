package structure;

import org.junit.jupiter.api.Test;


public class QueueTest {
    @Test
    void queue() {
        Queue<Integer> queue = new MyQueue<>(5);
//        queue.poll();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }
}

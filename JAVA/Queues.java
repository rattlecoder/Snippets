import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        // op => 1 2 3 4 5
    }
}

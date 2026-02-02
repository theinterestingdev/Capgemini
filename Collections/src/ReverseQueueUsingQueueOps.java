import java.util.*;

public class ReverseQueueUsingQueueOps {
    static void reverse(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            Integer x = q.remove();
            int m = n - i - 1;
            for (int j = 0; j < m; j++) {
                q.add(q.remove());
            }
            q.add(x);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(Arrays.asList(10, 20, 30));
        reverse(q);
        System.out.println(q);
    }
}

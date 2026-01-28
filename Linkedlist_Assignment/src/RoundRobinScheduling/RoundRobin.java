package RoundRobinScheduling;

public class RoundRobin {
    static class Node {
        int pid;
        int burst;
        int priority;
        int remaining;
        Node next;
        Node(int pid, int burst, int priority) {
            this.pid = pid;
            this.burst = burst;
            this.priority = priority;
            this.remaining = burst;
        }
    }

    Node head;
    Node tail;

    public void addProcessEnd(int pid, int burst, int priority) {
        Node n = new Node(pid, burst, priority);
        if (head == null) {
            head = tail = n;
            n.next = n;
            return;
        }
        tail.next = n;
        n.next = head;
        tail = n;
    }

    public boolean removeById(int pid) {
        if (head == null) return false;
        if (head == tail && head.pid == pid) { head = tail = null; return true; }
        Node prev = tail;
        Node cur = head;
        while (cur != null) {
            if (cur.pid == pid) {
                prev.next = cur.next;
                if (cur == head) head = cur.next;
                if (cur == tail) tail = prev;
                return true;
            }
            prev = cur;
            cur = cur.next;
            if (cur == head) break;
        }
        return false;
    }

    public void simulate(int quantum) {
        if (head == null) return;
        Node cur = head;
        while (head != null) {
            int run = Math.min(quantum, cur.remaining);
            cur.remaining -= run;
            System.out.println(list());
            if (cur.remaining == 0) {
                removeById(cur.pid);
                cur = head;
                if (cur == null) break;
            } else {
                cur = cur.next;
            }
        }
    }

    public String list() {
        if (head == null) return "";
        StringBuilder sb = new StringBuilder();
        Node p = head;
        while (p != null) {
            sb.append("[").append(p.pid).append(":").append(p.remaining).append("]");
            p = p.next;
            if (p == head) break;
        }
        return sb.toString();
    }
}

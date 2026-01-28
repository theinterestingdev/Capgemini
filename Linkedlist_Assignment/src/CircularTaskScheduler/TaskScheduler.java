package CircularTaskScheduler;

public class TaskScheduler {
    static class Node {
        int id;
        String name;
        int priority;
        String dueDate;
        Node next;
        Node(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    Node head;
    Node current;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Node n = new Node(id, name, priority, dueDate);
        if (head == null) {
            head = n;
            n.next = n;
            current = head;
            return;
        }
        Node tail = head;
        while (tail.next != head) tail = tail.next;
        n.next = head;
        head = n;
        tail.next = head;
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Node n = new Node(id, name, priority, dueDate);
        if (head == null) {
            head = n;
            n.next = n;
            current = head;
            return;
        }
        Node tail = head;
        while (tail.next != head) tail = tail.next;
        tail.next = n;
        n.next = head;
    }

    public void addAtPosition(int index, int id, String name, int priority, String dueDate) {
        if (head == null || index <= 0) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Node p = head;
        int i = 0;
        while (p.next != head && i < index - 1) {
            p = p.next;
            i++;
        }
        Node n = new Node(id, name, priority, dueDate);
        n.next = p.next;
        p.next = n;
    }

    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.id == id && head.next == head) {
            head = null;
            current = null;
            return true;
        }
        Node prev = head;
        Node cur = head.next;
        if (head.id == id) {
            while (prev.next != head) prev = prev.next;
            prev.next = head.next;
            if (current == head) current = head.next;
            head = head.next;
            return true;
        }
        while (cur != head) {
            if (cur.id == id) {
                prev.next = cur.next;
                if (current == cur) current = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public Node viewCurrent() {
        return current;
    }

    public Node nextTask() {
        if (current == null) return null;
        current = current.next;
        return current;
    }

    public void displayAll() {
        if (head == null) return;
        Node p = head;
        while (p != null) {
            System.out.println(p.id+" "+p.name+" "+p.priority+" "+p.dueDate);
            p = p.next;
            if (p == head) break;
        }
    }

    public Node searchByPriority(int priority) {
        if (head == null) return null;
        Node p = head;
        while (p != null) {
            if (p.priority == priority) return p;
            p = p.next;
            if (p == head) break;
        }
        return null;
    }
}

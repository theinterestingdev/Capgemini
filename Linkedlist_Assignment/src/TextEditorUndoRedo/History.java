package TextEditorUndoRedo;

public class History {
    static class Node {
        String state;
        Node next;
        Node prev;
        Node(String state) { this.state = state; }
    }

    Node head;
    Node tail;
    Node current;
    int limit = 10;
    int size = 0;

    public void setLimit(int n) { this.limit = n; trimLeft(); }

    public void addState(String s) {
        if (current != tail) {
            if (current == null) {
                head = tail = null;
                size = 0;
            } else {
                Node t = current.next;
                current.next = null;
                tail = current;
                while (t != null) {
                    Node nx = t.next;
                    t.prev = null;
                    t.next = null;
                    t = nx;
                    size--;
                }
            }
        }
        Node n = new Node(s);
        if (head == null) {
            head = tail = current = n;
            size = 1;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
            current = n;
            size++;
        }
        trimLeft();
    }

    private void trimLeft() {
        while (size > limit && head != null) {
            if (current == head) current = head.next;
            Node nx = head.next;
            if (nx != null) nx.prev = null;
            head.next = null;
            head = nx;
            if (head == null) tail = null;
            size--;
        }
    }

    public boolean undo() {
        if (current == null || current.prev == null) return false;
        current = current.prev;
        return true;
    }

    public boolean redo() {
        if (current == null || current.next == null) return false;
        current = current.next;
        return true;
    }

    public String current() {
        return current == null ? null : current.state;
    }
}

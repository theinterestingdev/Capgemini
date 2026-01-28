package LibraryManagement;

public class Library {
    static class Node {
        String title;
        String author;
        String genre;
        int id;
        boolean available;
        Node next;
        Node prev;
        Node(String title, String author, String genre, int id, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.id = id;
            this.available = available;
        }
    }

    Node head;
    Node tail;

    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Node n = new Node(title, author, genre, id, available);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Node n = new Node(title, author, genre, id, available);
        if (tail == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    public void addAtPosition(int index, String title, String author, String genre, int id, boolean available) {
        if (index <= 0 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        Node p = head;
        int i = 0;
        while (p.next != null && i < index - 1) {
            p = p.next;
            i++;
        }
        if (p.next == null) {
            addAtEnd(title, author, genre, id, available);
            return;
        }
        Node n = new Node(title, author, genre, id, available);
        n.next = p.next;
        n.prev = p;
        p.next.prev = n;
        p.next = n;
    }

    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.id == id) {
            if (head == tail) {
                head = tail = null;
                return true;
            }
            head = head.next;
            head.prev = null;
            return true;
        }
        if (tail.id == id) {
            tail = tail.prev;
            tail.next = null;
            return true;
        }
        Node p = head.next;
        while (p != null && p.id != id) p = p.next;
        if (p == null) return false;
        p.prev.next = p.next;
        if (p.next != null) p.next.prev = p.prev;
        return true;
    }

    public Node searchByTitle(String title) {
        Node p = head;
        while (p != null) {
            if (p.title.equalsIgnoreCase(title)) return p;
            p = p.next;
        }
        return null;
    }

    public Node searchByAuthor(String author) {
        Node p = head;
        while (p != null) {
            if (p.author.equalsIgnoreCase(author)) return p;
            p = p.next;
        }
        return null;
    }

    public boolean updateAvailability(int id, boolean available) {
        Node p = head;
        while (p != null) {
            if (p.id == id) {
                p.available = available;
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public void displayForward() {
        Node p = head;
        while (p != null) {
            System.out.println(p.title+" "+p.author+" "+p.genre+" "+p.id+" "+p.available);
            p = p.next;
        }
    }

    public void displayBackward() {
        Node p = tail;
        while (p != null) {
            System.out.println(p.title+" "+p.author+" "+p.genre+" "+p.id+" "+p.available);
            p = p.prev;
        }
    }

    public int count() {
        int c = 0;
        Node p = head;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }
}

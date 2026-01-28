package MovieManagementSystem;

public class Movies {
    static class Node {
        String title;
        String director;
        int year;
        double rating;
        Node next;
        Node prev;
        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    Node head;
    Node tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Node n = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Node n = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    public void addAtPosition(int index, String title, String director, int year, double rating) {
        if (index <= 0 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Node p = head;
        int i = 0;
        while (p.next != null && i < index - 1) {
            p = p.next;
            i++;
        }
        if (p.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        Node n = new Node(title, director, year, rating);
        n.next = p.next;
        n.prev = p;
        p.next.prev = n;
        p.next = n;
    }

    public boolean removeByTitle(String title) {
        if (head == null) return false;
        if (head.title.equalsIgnoreCase(title)) {
            if (head == tail) { head = tail = null; return true; }
            head = head.next;
            head.prev = null;
            return true;
        }
        if (tail.title.equalsIgnoreCase(title)) {
            tail = tail.prev;
            tail.next = null;
            return true;
        }
        Node p = head.next;
        while (p != null && !p.title.equalsIgnoreCase(title)) p = p.next;
        if (p == null) return false;
        p.prev.next = p.next;
        if (p.next != null) p.next.prev = p.prev;
        return true;
    }

    public Node searchByDirector(String director) {
        Node p = head;
        while (p != null) {
            if (p.director.equalsIgnoreCase(director)) return p;
            p = p.next;
        }
        return null;
    }

    public Node searchByRating(double rating) {
        Node p = head;
        while (p != null) {
            if (Double.compare(p.rating, rating) == 0) return p;
            p = p.next;
        }
        return null;
    }

    public boolean updateRating(String title, double rating) {
        Node p = head;
        while (p != null) {
            if (p.title.equalsIgnoreCase(title)) {
                p.rating = rating;
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public void displayForward() {
        Node p = head;
        while (p != null) {
            System.out.println(p.title+" "+p.director+" "+p.year+" "+p.rating);
            p = p.next;
        }
    }

    public void displayBackward() {
        Node p = tail;
        while (p != null) {
            System.out.println(p.title+" "+p.director+" "+p.year+" "+p.rating);
            p = p.prev;
        }
    }
}

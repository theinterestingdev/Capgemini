package TicketReservation;

public class TicketSystem {
    static class Node {
        int ticketId;
        String customer;
        String movie;
        String seat;
        String time;
        Node next;
        Node(int ticketId, String customer, String movie, String seat, String time) {
            this.ticketId = ticketId;
            this.customer = customer;
            this.movie = movie;
            this.seat = seat;
            this.time = time;
        }
    }

    Node head;

    public void addEnd(int ticketId, String customer, String movie, String seat, String time) {
        Node n = new Node(ticketId, customer, movie, seat, time);
        if (head == null) {
            head = n;
            n.next = n;
            return;
        }
        Node tail = head;
        while (tail.next != head) tail = tail.next;
        tail.next = n;
        n.next = head;
    }

    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.next == head && head.ticketId == id) { head = null; return true; }
        Node prev = head;
        Node cur = head.next;
        if (head.ticketId == id) {
            while (prev.next != head) prev = prev.next;
            prev.next = head.next;
            head = head.next;
            return true;
        }
        while (cur != head) {
            if (cur.ticketId == id) {
                prev.next = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public void display() {
        if (head == null) return;
        Node p = head;
        while (p != null) {
            System.out.println(p.ticketId+" "+p.customer+" "+p.movie+" "+p.seat+" "+p.time);
            p = p.next;
            if (p == head) break;
        }
    }

    public Node searchByCustomer(String customer) {
        if (head == null) return null;
        Node p = head;
        while (p != null) {
            if (p.customer.equalsIgnoreCase(customer)) return p;
            p = p.next;
            if (p == head) break;
        }
        return null;
    }

    public Node searchByMovie(String movie) {
        if (head == null) return null;
        Node p = head;
        while (p != null) {
            if (p.movie.equalsIgnoreCase(movie)) return p;
            p = p.next;
            if (p == head) break;
        }
        return null;
    }

    public int count() {
        if (head == null) return 0;
        int c = 0;
        Node p = head;
        while (p != null) {
            c++;
            p = p.next;
            if (p == head) break;
        }
        return c;
    }
}

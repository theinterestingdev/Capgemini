package InventoryManagement;

import java.util.*;

public class Inventory {
    static class Node {
        String name;
        int id;
        int qty;
        double price;
        Node next;
        Node(String name, int id, int qty, double price) {
            this.name = name;
            this.id = id;
            this.qty = qty;
            this.price = price;
        }
    }

    Node head;

    public void addAtBeginning(String name, int id, int qty, double price) {
        Node n = new Node(name, id, qty, price);
        n.next = head;
        head = n;
    }

    public void addAtEnd(String name, int id, int qty, double price) {
        Node n = new Node(name, id, qty, price);
        if (head == null) {
            head = n;
            return;
        }
        Node p = head;
        while (p.next != null) p = p.next;
        p.next = n;
    }

    public void addAtPosition(int index, String name, int id, int qty, double price) {
        if (index <= 0 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Node p = head;
        int i = 0;
        while (p.next != null && i < index - 1) {
            p = p.next;
            i++;
        }
        Node n = new Node(name, id, qty, price);
        n.next = p.next;
        p.next = n;
    }

    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.id == id) {
            head = head.next;
            return true;
        }
        Node p = head;
        while (p.next != null && p.next.id != id) p = p.next;
        if (p.next == null) return false;
        p.next = p.next.next;
        return true;
    }

    public boolean updateQty(int id, int qty) {
        Node p = head;
        while (p != null) {
            if (p.id == id) {
                p.qty = qty;
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public Node searchById(int id) {
        Node p = head;
        while (p != null) {
            if (p.id == id) return p;
            p = p.next;
        }
        return null;
    }

    public List<Node> searchByName(String name) {
        List<Node> r = new ArrayList<>();
        Node p = head;
        while (p != null) {
            if (p.name.equalsIgnoreCase(name)) r.add(p);
            p = p.next;
        }
        return r;
    }

    public double totalValue() {
        double s = 0;
        Node p = head;
        while (p != null) {
            s += p.price * p.qty;
            p = p.next;
        }
        return s;
    }

    public void sortByName(boolean asc) {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node p = head;
            while (p.next != null) {
                int cmp = p.name.compareToIgnoreCase(p.next.name);
                if ((asc && cmp > 0) || (!asc && cmp < 0)) {
                    swapData(p, p.next);
                    swapped = true;
                }
                p = p.next;
            }
        } while (swapped);
    }

    public void sortByPrice(boolean asc) {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node p = head;
            while (p.next != null) {
                int cmp = Double.compare(p.price, p.next.price);
                if ((asc && cmp > 0) || (!asc && cmp < 0)) {
                    swapData(p, p.next);
                    swapped = true;
                }
                p = p.next;
            }
        } while (swapped);
    }

    private void swapData(Node a, Node b) {
        String n = a.name; a.name = b.name; b.name = n;
        int i = a.id; a.id = b.id; b.id = i;
        int q = a.qty; a.qty = b.qty; b.qty = q;
        double pr = a.price; a.price = b.price; b.price = pr;
    }

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.println(p.name+" "+p.id+" "+p.qty+" "+p.price);
            p = p.next;
        }
    }
}

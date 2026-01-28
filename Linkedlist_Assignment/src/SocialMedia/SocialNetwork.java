package SocialMedia;

import java.util.*;

public class SocialNetwork {
    static class User {
        int id;
        String name;
        int age;
        List<Integer> friends = new ArrayList<>();
        User next;
        User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    User head;

    public void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }

    private User find(int id) {
        User p = head;
        while (p != null) {
            if (p.id == id) return p;
            p = p.next;
        }
        return null;
    }

    public boolean addFriend(int a, int b) {
        User u = find(a);
        User v = find(b);
        if (u == null || v == null || a == b) return false;
        if (!u.friends.contains(b)) u.friends.add(b);
        if (!v.friends.contains(a)) v.friends.add(a);
        return true;
    }

    public boolean removeFriend(int a, int b) {
        User u = find(a);
        User v = find(b);
        if (u == null || v == null) return false;
        u.friends.remove((Integer)b);
        v.friends.remove((Integer)a);
        return true;
    }

    public List<Integer> mutualFriends(int a, int b) {
        User u = find(a);
        User v = find(b);
        List<Integer> r = new ArrayList<>();
        if (u == null || v == null) return r;
        for (int x : u.friends) {
            for (int y : v.friends) {
                if (x == y) r.add(x);
            }
        }
        return r;
    }

    public void displayFriends(int id) {
        User u = find(id);
        if (u == null) return;
        for (int f : u.friends) System.out.println(f);
    }

    public User searchByName(String name) {
        User p = head;
        while (p != null) {
            if (p.name.equalsIgnoreCase(name)) return p;
            p = p.next;
        }
        return null;
    }

    public User searchById(int id) {
        return find(id);
    }

    public int countFriends(int id) {
        User u = find(id);
        if (u == null) return 0;
        return u.friends.size();
    }
}

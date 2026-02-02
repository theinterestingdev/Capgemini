import java.util.*;

public class HospitalTriageSystem {
    static class Patient {
        String name; int severity;
        Patient(String n, int s){name=n;severity=s;}
        public String toString(){return name;}
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a,b)->Integer.compare(b.severity,a.severity));
        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));
        List<String> order = new ArrayList<>();
        while(!pq.isEmpty()) order.add(pq.remove().name);
        System.out.println(order);
    }
}

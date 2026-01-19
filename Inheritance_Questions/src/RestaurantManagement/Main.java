package RestaurantManagement;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Marco", 101);
        Waiter waiter = new Waiter("Sophia", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

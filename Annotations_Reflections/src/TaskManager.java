public class TaskManager {
    
    @TaskInfo(priority = "HIGH", assignedTo = "John")
    public void processPayment() {
        System.out.println("Processing payment");
    }
    
    @TaskInfo(priority = "MEDIUM", assignedTo = "Alice")
    public void generateReport() {
        System.out.println("Generating report");
    }
    
    public void cleanup() {
        System.out.println("Cleaning up resources");
    }
}

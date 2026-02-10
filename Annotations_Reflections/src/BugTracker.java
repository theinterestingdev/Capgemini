public class BugTracker {
    
    @BugReport(description = "Null pointer exception when user is null")
    @BugReport(description = "Performance issue with large datasets")
    public void processData() {
        System.out.println("Processing data");
    }
    
    public void cleanData() {
        System.out.println("Cleaning data");
    }
}

import java.lang.reflect.Method;

public class BugReportDemo {
    public static void main(String[] args) {
        BugTracker tracker = new BugTracker();
        Class<?> clazz = tracker.getClass();
        
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {
                System.out.println("Method: " + method.getName());
                
                BugReport[] reports = method.getAnnotationsByType(BugReport.class);
                for (BugReport report : reports) {
                    System.out.println("Bug: " + report.description());
                }
                System.out.println();
            }
        }
    }
}

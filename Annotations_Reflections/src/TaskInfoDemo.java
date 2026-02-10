import java.lang.reflect.Method;

public class TaskInfoDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Class<?> clazz = manager.getClass();
        
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo annotation = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Assigned to: " + annotation.assignedTo());
                System.out.println();
            }
        }
    }
}

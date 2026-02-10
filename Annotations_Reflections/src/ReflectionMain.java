import java.lang.reflect.Field;

public class ReflectionMain {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Class<?> clazz = Person.class;
            
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);
            
            int currentAge = (int) ageField.get(person);
            System.out.println("Current age: " + currentAge);
            
            ageField.set(person, 30);
            int newAge = (int) ageField.get(person);
            System.out.println("New age: " + newAge);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

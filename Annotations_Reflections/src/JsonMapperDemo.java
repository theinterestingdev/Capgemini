public class JsonMapperDemo {
    public static void main(String[] args) {
        User user = new User("john_doe", 25, "john@example.com");
        String json = JsonMapper.toJson(user);
        System.out.println(json);
    }
}

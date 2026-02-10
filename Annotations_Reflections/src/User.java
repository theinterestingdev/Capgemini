public class User {
    @JsonField(name = "user_name")
    private String username;
    
    @JsonField(name = "user_age")
    private int age;
    
    @JsonField(name = "email_address")
    private String email;
    
    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
    
    public String getUsername() { return username; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
}

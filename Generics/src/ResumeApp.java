import java.util.*;

abstract class JobRole {
    abstract String getRole();
}

class SoftwareEngineer extends JobRole {
    String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    String getRole() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public void process() {
        System.out.println(candidateName + " - " + role.getRole());
    }
}

public class ResumeApp {
    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r.getRole());
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 =
                new Resume<>("Amit", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Neha", new DataScientist());

        r1.process();
        r2.process();

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new ProductManager());

        screenResumes(roles);
    }
}

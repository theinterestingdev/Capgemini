public class Person {

    String name;
    String gender;
    int age;


    public Person(String name,String gender,int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(Person p){
        name = p.name;
        gender = p.gender;
        age = p.age;
    }

    public void displayDetails()
    {
        System.out.println("Person's name : "+name);
        System.out.println("Person's gender : "+gender);
        System.out.println("Person's age : "+age);
        System.out.println("=======================================");
    }

    public static void main(String[] args) {

        Person person = new Person("Kartik","Male",21);
        Person pclone = new Person(person);

        person.displayDetails();
        pclone.displayDetails();

    }




}

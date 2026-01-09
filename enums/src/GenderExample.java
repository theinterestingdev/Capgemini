public class GenderExample {


    enum Gender
    {
        MALE,FEMALE,OTHER
    }
    static class Person{

        private String name;
        private Gender gender;

        public Person(String name,Gender gender)
        {
            this.name = name;
            this.gender = gender;
        }

        public void details()
        {
            System.out.println("Name : "+name+" "+"Gender : "+gender);
        }



    }


    public static void main(String[] args) {

        Person p1 = new Person("Kartik",Gender.MALE);
        Person p2 = new Person("DEMO",Gender.FEMALE);
        Person p3 = new Person("TEST",Gender.OTHER);

        p1.details();
        p2.details();
        p3.details();

    }



}

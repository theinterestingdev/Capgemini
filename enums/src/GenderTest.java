public class GenderTest {


    enum Gender
    {
        MALE,FEMALE,OTHER;
    }

    private String name;
    private Gender gender;

    public GenderTest(String name,Gender gender)
    {
        this.name = name;
        this.gender = gender;
    }

    public void details(){
        System.out.println("Name : "+name+" "+"Gender : "+gender);
    }

    public static void main(String[] args) {

        GenderTest g = new GenderTest("Kartik",Gender.MALE);
        GenderTest g1 = new GenderTest("Karan",Gender.MALE);

        g.details();
        g1.details();


    }

}


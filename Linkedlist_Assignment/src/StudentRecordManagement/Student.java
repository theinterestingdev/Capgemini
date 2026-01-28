package StudentRecordManagement;

public class Student {

    static class StudentNode {

        int rollNo;
        String name;
        int age;
        char Grade;
        StudentNode next;

        public StudentNode(int rollNo, String name, int age, char Grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.Grade = Grade;
            this.next = null;
        }
    }


    StudentNode head;

    public void  insertAtBeginning(int rollNo,String name,int age,char Grade)
    {
        StudentNode studentNode = new StudentNode(rollNo,name,age,Grade);

        if(head==null)
        {
            head=studentNode;
            return;
        }

        studentNode.next = head;
        head = studentNode;


    }

    public void insertAtEnd(int rollNo,String name,int age,char Grade)
    {
        StudentNode studentnode = new StudentNode(rollNo,name,age,Grade);

        if(head==null)
        {
            head = studentnode;
            return;
        }

        StudentNode temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = studentnode;

    }

    public void insertAtPosition(int index,int rollNo,String name,int age,char Grade)
    {
        if(index<=0 || head==null)
        {
            insertAtBeginning(rollNo,name,age,Grade);
            return;
        }
        StudentNode node = new StudentNode(rollNo,name,age,Grade);
        StudentNode temp = head;
        int i=0;
        while(temp!=null && i<index-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp==null)
        {
            insertAtEnd(rollNo,name,age,Grade);
        }
        else
        {
            node.next = temp.next;
            temp.next = node;
        }
    }

    void search(int rollNo)
    {
        StudentNode temp = head;

        while(temp!=null)
        {
            if(temp.rollNo == rollNo){
                System.out.println("Student Found");
                System.out.println("Student Name : "+temp.name);
                System.out.println("Student Age : "+temp.age);
                System.out.println("Student Grade : "+temp.Grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");

    }

    void delete(int rollNo)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }

        if(head.rollNo == rollNo)
        {
            head = head.next;
            System.out.println("Record Deleted");
            return;
        }

        StudentNode temp = head;

        while(temp.next!=null && temp.next.rollNo!=rollNo)
        {
            temp = temp.next;
        }

        if(temp.next==null)
        {
            System.out.println("Record not found");
            return;
        }else
        {
            temp.next = temp.next.next;
            System.out.println("Record deleted");
        }

    }

    void updateGrade(int rollNo,char grade)
    {
        StudentNode temp = head;
        while(temp!=null)
        {
            if(temp.rollNo==rollNo)
            {
                temp.Grade = grade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void display()
    {
        StudentNode temp = head;

        while(temp!=null)
        {
            System.out.println("Student Name : "+temp.name);
            System.out.println("Student Age : "+temp.age);
            System.out.println("Student Grade : "+temp.Grade);
            System.out.println("======================================");
            temp =temp.next;
        }

    }



    public static void main(String[] args) {

        Student student = new Student();
        student.insertAtBeginning(1759,"Kartik",21,'A');
        student.insertAtBeginning(1760,"Rohan",21,'B');
        student.insertAtEnd(1761,"Larry",22,'C');
        student.display();






    }

}

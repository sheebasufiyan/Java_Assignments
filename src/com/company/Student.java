package com.company;
class Students
{
    String firstName=new String();
    String lastName=new String();
    String address=new String();
    String phno=new String();
    Students(String firstName,String lastName ,String address,String phno)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phno=phno;
    }

    void display()
    {
        System.out.println("Name is "+firstName+" "+lastName);
        System.out.println("Address  "+address);
        System.out.println("Contact number "+phno);
    }
}
class Education extends Students
{
    int roll,age;
    char section;
    String branch=new String();
    Education(String a, String b, String c, String d, int e, int f, char  g, String h)
    {
        super(a,b,c,d);
        roll=e;
        age=f;
        section=g;
        branch=h;
    }
    void display()
    {
        super.display();
        System.out.println("Roll Number="+roll);
        System.out.println("AGE="+age);
        System.out.println("SECTION="+section);
        System.out.println("Branch is "+branch);

    }

}

class Student
{
    public static void main(String args[])
    {
        Education e=new Education("Sheeba","Sufiyan","Chikmagaluru","9885098850",10,22,'B',"IT");
        e.display();
    }
}
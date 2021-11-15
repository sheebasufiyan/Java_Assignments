package com.company;

import java.util.*;

class Employee
{
    Scanner s=new Scanner(System.in);
    int emp_id;
    String empname;
    Employee(int emp_id,String empname){
        this.emp_id=emp_id;
        this.empname=empname;

    }
    void display(){
        System.out.println(emp_id+":"+empname);
    }
}
class Salary extends Employee
{
    //Scanner s=new Scanner(System.in);
    double monthly_salary;
    String designation;
    Salary(double monthly_salary,String designation,int emp_id,String empname)
    {
        super(emp_id,empname);
        this.designation=designation;
        this.monthly_salary=monthly_salary;
    }
    void display(int monthly_salary)
    {
        System.out.println("monthly salary is:"+monthly_salary);
        if(monthly_salary>20000)
        {
            System.out.println("___________________________________________________________\nFUNCTION OVERLOADING");
            System.out.println("name of employee is::"+empname);
            System.out.println("id of employee is::"+emp_id);
            System.out.println("monthly salary is::"+monthly_salary);
            System.out.println("designation of employee is::"+designation);
        }
        else
        {
            System.out.println("Cannot display details....");
        }
    }
    void display(){
        System.out.println("__________________________________________________________________\nFUNCTION OVERRIDING");
        System.out.println("name of employee is::"+empname);
        System.out.println("id of employee is::"+emp_id);
        System.out.println("monthly salary is::"+monthly_salary);
        System.out.println("designation of employee is::"+designation);

    }

}
 class Hierarchial {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int id;
        String name, designation;
        int salary;

            System.out.println("enter id of employee..");
            id = s.nextInt();
            System.out.println("enter name of employee..");
            name = s.next();
            System.out.println("enter designation of employee...");
            designation = s.next();
            System.out.println("enter salary of employee");
            salary = s.nextInt();
            Salary employeeObject = new Salary(salary, designation, id, name);
            employeeObject.display(salary);
            employeeObject.display();

    }
}
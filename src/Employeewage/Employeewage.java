package Employeewage;

public class Employeewage {

    public void EmployeePresentorAbesnt()
    {
        int check=(int)(Math.random()*2);
        System.out.println("\n\n check the employee present or absent:");

        if(check == 1)
            System.out.println("\nemployee is present today");
        else
            System.out.println("\nemployee is absent today");
    }
    public static void main(String[] args) {
    System.out.println("\n        Welcome to Employee Wage Computation Program");

    Employeewage emp=new Employeewage();
    emp.EmployeePresentorAbesnt();
    }
}

package Employeewage;

import java.util.Scanner;

public class Employeewage
{
    public static int check=(int)(Math.random()*2);
    int checkfullhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
    int checkparthours = (int) (Math.floor(Math.random() * 4 % 5) + 1);
    public static int WAGE_PER_HOUR = 20,FULL_DAY_HOUR = 8,PART_TIME_HOUR=4,FULL_MONTH_HOUR=100,PART_MONTH_HOUR=50;


    public void fulltimeemployeePresentorAbesnt()
    {
        System.out.println("\n\ncheck the fulltime employee present or absent:");
        employeePresentorAbesnt();
        employeewage(FULL_DAY_HOUR,checkfullhours);
        monthlywage(FULL_MONTH_HOUR,WAGE_PER_HOUR);
    }

    public void parttimeemployeewage()
    {
        System.out.println("\n\ncheck the parttime employee present or absent:");
        employeePresentorAbesnt();
        employeewage(PART_TIME_HOUR,checkparthours);
        monthlywage(PART_MONTH_HOUR,WAGE_PER_HOUR);

    }

    public void employeePresentorAbesnt()
    {
        if(check == 1)
            System.out.println("\n  employee is present today");
        else
            System.out.println("\n  employee is absent today");
    }


    public void employeewage(int hour,int present)
    {
        System.out.println("\n\ncheck the employee daily wage:");
        int fullpresent = WAGE_PER_HOUR * hour;
        System.out.println("\n  if employee worker is present for full hour, the salary is " + fullpresent);
        if (check == 1) {
            int hoursbased = present * WAGE_PER_HOUR;
            System.out.println("\n  employee's salary based on hours, employee present for " + present + " hours so his salary is " + hoursbased);
        } else
            System.out.println("\n  the employee's salary is 0, because employee is absent");
    }

    public void monthlywage(int hours,int wage)
    {
        System.out.println("\n\ncheck the employee monthly wage:");
        int monthlysalary=hours*wage;
    System.out.println("\n  Employee's monthly salary is "+monthlysalary);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    System.out.println("\n        Welcome to Employee Wage Computation Program");

    Employeewage emp=new Employeewage();

    System.out.println("\nenter the employee to check attendance and wage:");
    System.out.println("\n  Enter\n  1 for FullTime Employee\n  2 for PartTime Employee");
    System.out.println("\n  your choice: ");int choice=sc.nextInt();

        switch (choice)
        {
        case 1:
        {
            emp.fulltimeemployeePresentorAbesnt();
        }
        break;
        case 2:
        {
            emp.parttimeemployeewage();
        }break;
        }
    }
}

package Employeewage;

public class Employeewage
{
    public static int check=(int)(Math.random()*2);
    public void employeePresentorAbesnt()
    {

        System.out.println("\n\ncheck the employee present or absent:");

        if(check == 1)
            System.out.println("\n  employee is present today");
        else
            System.out.println("\n  employee is absent today");
    }

    public void dailyemployeewage()
    {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        System.out.println("\n\ncheck the employee daily wage:");
        int fullpresent = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("\n  if employee worker is present for full day, the salary is " + fullpresent);
        if (check == 1) {
            int checkhours = (int) (Math.floor(Math.random() * 8 % 9) + 1);
            int hoursbased = checkhours * WAGE_PER_HOUR;
            System.out.println("\n  employee's salary based on hours, employee present for " + checkhours + " hours so his salary is " + hoursbased);
        } else
            System.out.println("\n  the employee's salary is 0, because employee is absent");
    }


    public static void main(String[] args)
    {
    System.out.println("\n        Welcome to Employee Wage Computation Program");

    Employeewage emp=new Employeewage();
    emp.employeePresentorAbesnt();
    emp.dailyemployeewage();
    }
}

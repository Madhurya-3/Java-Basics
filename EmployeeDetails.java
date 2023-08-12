import java.util.*;
class Employee
{
    Scanner sc= new Scanner(System.in);
    String name[]=new String[3];
    int year[]=new int[3];
    String ad[]=new String[3];
    void input_name()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the Employee name");
            name[i]=sc.nextLine();
        }
    }
    void input_year()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the Employee year of joining");
            year[i]=sc.nextInt();
        }
    }
    void input_address()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter an Employee address");
            ad[i]=sc.nextLine();
        }
    }
    void output1()
    {
        System.out.print("Name \t");
        System.out.print("Year of Joining \t");
        System.out.print("Address \t");
        System.out.println();
    }
    void output2()
    {
        for(int i=0;i<3;i++)
        {
            System.out.print(name[i]+" \t");
            System.out.print(year[i]+" \t");
            System.out.print(ad[i]+" - Walls Street");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Employee ob= new Employee();
        ob.input_name();
        ob.input_year();
        ob.input_address();
        ob.output1();
        ob.output2();
    }
}

import java.util.*;
class Prime
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please insert any number");
        int n=sc.nextInt();
        int i,ctr=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                ctr++;
                break;
            }
        }
        if(ctr==0)
        System.out.println(n+" is a Prime Number.");
        else
        System.out.println(n+" is not a Prime Number.");
    }
}

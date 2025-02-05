package ListAssignment;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Assignment9Sample
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of Number:");
        int n=obj.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("The entered number is prime number");
            else
            System.out.println("The entered number is Not Prime Number");



    }
}

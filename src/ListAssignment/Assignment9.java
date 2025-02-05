package ListAssignment;

import java.util.Scanner;

public class Assignment9
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n=obj.nextInt();
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                    count++;

            }
            if(count==1)
                System.out.println(i);
        }

    }
}

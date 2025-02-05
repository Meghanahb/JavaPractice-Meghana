package ListAssignment;

import java.util.Scanner;
import java.util.Vector;

public class Assignment12
{
    public static void main(String[] args)
    {
        Vector vector=new Vector();

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int n=obj.nextInt();

        System.out.println("Enter the Element:");
        for(int i=0;i<n;i++)
        {
            vector.add(obj.nextInt());
        }

        System.out.println("Before Reverse:" +vector);
        System.out.println("After Reverse:" +vector.reversed());

        /*System.out.append("Element Before Reverse");
        for(int j=0; j<n; j++)
        {
            System.out.println(vector.get(j));
        }

        System.out.println("Element After Reverse");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(vector.get(i));
        }*/
    }
}

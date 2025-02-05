package ListAssignment;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment13
{
    public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int n=obj.nextInt();
        int[] array=new int[n];

        System.out.println("Enter the Element:");
        for(int i=0;i<n;i++)
        {
            array[i]=obj.nextInt();
        }

        System.out.println("Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        //int i,j;
        int temp=0;
        System.out.println("Array Element is Ascending Order");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
                }

            }
            System.out.print(array[i] +" ");
        }
        System.out.println();
        System.out.println("Array Element is Descending Order:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
            System.out.print(array[i]  +" ");
        }



        //System.out.println(array[j]);
        /*ArrayList<Integer> arrlist=new ArrayList<>();
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the Value of N:");
        int n=obj.nextInt();

        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            arrlist.add(obj.nextInt());
        }

        System.out.println("entered Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arrlist.get(i));
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arrlist.get(i)>arrlist.get(j))
                {
                   arrlist.get(j)=arrlist.get(i);
                }

            }
        }*/
    }
}

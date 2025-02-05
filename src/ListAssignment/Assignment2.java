package ListAssignment;

import java.util.Vector;

public class Assignment2
{
   public static void main(String[] args)
   {
       Vector<Integer> v=new Vector<>();
       v.add(4);
       v.add(5);
       v.add(0);
       v.add(9);
       v.add(8);
       v.add(10);
       System.out.println(v);
       int sum=0;
       for(int i=0;i<v.size();i++)
       {
           if(v.get(i)%2==0)
           {
              sum=sum+v.get(i);
           }
       }
       System.out.println("Sum of Even Number:"+sum);
   }
}

package ListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(10);
        System.out.println(al);
        //System.out.println(al.size());
        int sum=0;
        for(int i=0;i<al.size();i++)
        {
            sum=sum+al.get(i);
        }
        System.out.println("Sum OF Elements:"+sum);
        int avrg=0;
        avrg=(sum/al.size());
        System.out.println("Average Of Element:"+avrg);
    }
}

package ListAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment14
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(8);
        list.add(6);
        System.out.println("List Element:" +list);

        /*Set set=new HashSet(list);
        System.out.println("Distinct Element:" +set);*/

        List dislist=new ArrayList();
        for(int i=0;i<list.size();i++)
        {
            int count=0;
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    count++;
                }
            }
            if(count==0)
                dislist.add(list.get(i));
        }

        System.out.println("Distnict Element:" + dislist);
        System.out.println("First Non-Repeating Element:" + dislist.get(0));

    }
}

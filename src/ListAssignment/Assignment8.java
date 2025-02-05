package ListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Assignment8
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(4);
        list1.add(9);
        list1.add(8);
        list1.add(5);
        System.out.println("List1 Element:" +list1);

        List list2=new ArrayList();
        list2.add(1);
        list2.add(8);
        list2.add(0);
        list2.add(5);
        list2.add(1);
        list2.add(6);
        System.out.println("List2 Element:" +list2);
        ArrayList finallist=new ArrayList();

        for(int i=0;i<list1.size();i++)
        {
            for(int j=0;j<list2.size();j++)
            {
                if(list1.get(i)==list2.get(j))
                {
                  finallist.add(list1.get(i));
                }
            }

        }

        System.out.println("Common Element from Both List:" +finallist);

    }
}

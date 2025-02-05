package ListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assignment4
{
    public static void main(String[] args)
    {
        LinkedList llist=new LinkedList();
        llist.add(9);
        llist.add(8);
        llist.add(10);
        System.out.println("List-1:"+llist);

        ArrayList alist=new ArrayList();
        alist.add(4);
        alist.add(5);
        alist.add(0);
        System.out.println("List-2:"+alist);

        llist.addAll(alist);
        System.out.println("Final List:" +llist);

    }
}

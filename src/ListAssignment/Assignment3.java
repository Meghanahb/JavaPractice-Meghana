package ListAssignment;

import java.util.ArrayList;

public class Assignment3
{
    public static void main(String[] args)
    {
        ArrayList<String> alist=new ArrayList<>();
        alist.add("4");
        alist.add("5");
        alist.add("0");
        alist.add("9");
        alist.add("8");
        alist.add("10");
        System.out.println("Actual List:" +alist);
        System.out.println("List Split-1 "+alist.subList(0,3));
        System.out.println("List Split-2 "+alist.subList(3,6));
    }
}

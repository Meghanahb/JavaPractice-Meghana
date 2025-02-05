package ListAssignment;

import java.util.ArrayList;

public class Assignment5
{
    public static void main(String[] args)
    {
        ArrayList<String> ary=new ArrayList<>();
        ary.add("kavya");
        ary.add("yogi");
        ary.add("meghana");
        ary.add("QA");
        ary.add("test");
        ary.add("automation");
        ary.add("yogi");
        ary.add("meghana");
        ary.add("QA");
        //ary.add("test");
        System.out.println("ArrayList:" +ary);

        ArrayList<String> ary2=new ArrayList<>();
        for(int i=0;i<ary.size();i++)
        {
            int count=0;
            for(int j=i+1;j<ary.size();j++)
            {
                if(ary.get(i).equals(ary.get(j)))
                {
                  count++;
                }
            }
            if(count==0)
                ary2.add(ary.get(i));
        }
        System.out.println(ary2);

        for(int i=0;i<ary2.size();i++)
        {
            int count1=0;
            for(int j=0;j<ary.size();j++)
            {
                if(ary2.get(i)==ary.get(j))
                {
                   count1++;
                }
            }
            if(count1>1)
                System.out.println(ary2.get(i) +"----->" +count1);
        }
    }
}

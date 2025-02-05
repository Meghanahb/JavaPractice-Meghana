package ListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment16
{
    public static void main(String[] args)
    {
        int target=10;
        /*int[] array={1,3,4,7,8,9};

        System.out.println("Actual Array");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]+array[j]==target)
                {
                    System.out.println("Index Value:" +i  +" " +j);
                    //System.out.println(j);
                }
            }
        }*/
        List<Integer> arraylist=new ArrayList();
        arraylist.add(1);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(7);
        arraylist.add(8);
        arraylist.add(2);
        System.out.println("Actual Array List:" +arraylist);

        for(int i=0;i<arraylist.size();i++)
        {
            for(int j=i+1;j<arraylist.size();j++)
            {
                //if(arraylist.get(i)+arraylist.get(j).equals(target))
                int value=arraylist.get(i)+arraylist.get(j);
                if(value==target)
                {
                    System.out.println("Index Value:" +i +" " +j);
                }

            }
        }
    }
}

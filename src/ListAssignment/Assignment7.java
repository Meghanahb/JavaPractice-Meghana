package ListAssignment;

import java.util.*;

public class Assignment7
{
    public static void main(String args[])
    {
        List arr=new ArrayList<>();
        arr.add(4);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(4);
        arr.add(8);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);


        //**********************Using Set Interface we can delete duplicate******************
        /*System.out.println(Arrays.asList(arr));
        Set set=new HashSet(arr);
        System.out.println(set);*/
        //*********************************************************


        for(int i=0;i<arr.size();i++)
        {
            //int count=0;
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)==arr.get(j))
                {

                    //count++;
                    arr.remove(j);
                }
            }

        }
        System.out.println("After Deleteing Duplicate Elements from List:" +arr);
    }
}

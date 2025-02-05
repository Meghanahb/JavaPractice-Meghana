package ListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment11
{
    public static void main(String[] args) {

        /*ArrayList list=new ArrayList();
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(5);
        list.add(6);
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(8))
            {
              System.out.println(i);
            }
        }*/

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = obj.nextInt();

        ArrayList list = new ArrayList(n);

        //int arr[]=new int[n];

        System.out.println("Enter array element:");
        for (int i = 0; i < n; i++)
        //arr[i]=obj.nextInt();

        {
            list.add(obj.nextInt());
        }
        System.out.println("Entered Array Element:");
        for(int i=0; i<n;i++)
            //System.out.println(arr[i]);
        {
            System.out.println(list.get(i));
        }
        System.out.println("Enter the target element");
        int target=obj.nextInt();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(target))
            {
                System.out.println("The position of the given target element is:" +i);
            }
        }









    }

}

package ListAssignment;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
//  WAP to Delete the
public class Assignmen10 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(4);
        arr.add(8);
        arr.add(9);
        System.out.println("Array List-1:" +arr);


        ArrayList arr1 = new ArrayList();
        arr1.add(4);
        arr1.add(1);
        arr1.add(9);
        arr1.add(4);
        arr1.add(8);
        arr1.add(0);
        arr1.add(5);
        arr1.add(1);
        arr1.add(8);
        arr1.add(6);
        System.out.println("Array List-2:" +arr1);

        for (int i = 0; i < arr.size(); i++) {

            for (int j = 0; j < arr1.size(); j++)
            {
                if (arr.get(i) == arr1.get(j))
                {
                    arr1.remove(arr.get(i));
                }
            }
        }
        System.out.println("Final Array:" +arr1);
    }
}



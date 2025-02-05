package MapAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Assignement6And7
{
    public static void main(String[] args)
    {
        HashMap map=new HashMap();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        System.out.println("Number of KEy-Value Pair: " +map.size());
        map.clear();
        System.out.println(map.size());



        //Note: In HAshMap We dont have remove All menthod , But we have in Set
        Set<Integer> set=new HashSet();
        set.add(1);
        set.add(2);
        System.out.println("Before Remove:" +set);
        set.removeAll(set);
        System.out.println("After Remove:" +set);





    }
}

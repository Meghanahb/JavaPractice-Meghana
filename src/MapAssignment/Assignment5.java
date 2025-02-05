package MapAssignment;

import java.util.HashMap;

public class Assignment5
{
    public static void main(String[] args)
    {
        HashMap map=new HashMap();
        map.put(1, "megha");
        map.put(2,"praju");
        map.put(3,"jaya");
        map.put(4,"basavanna");
        System.out.println("First Map Set:"+map);

        System.out.println("Check the given Key present or Not:" +map.containsKey(2));
        System.out.println(("Check the given Value is present in map or not:" +map.containsValue("megha")));

        HashMap map1=new HashMap();
        map1.put(1,"soft");
        map1.put(2,"hard");
        map.putAll(map1);
        System.out.println("After Adding key-value pair:" +map);


    }

}

package MapAssignment;

import java.util.*;
import java.util.Map.Entry;

public class Assignment3
{
    public static void main(String args[])
    {
        HashMap map=new HashMap();
        map.put("FiVE",5);
        map.put("FOUR",4);
        map.put("THREE",3);
        map.put("TWO",2);
        map.put("ONE",1);
        /*System.out.println(map);

        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key);
        }
        Collection<Integer> values=map.values();
        for(Integer value:values)
        {
            System.out.println(value);
        }*/

        Set<Entry<String,Integer>> entries=map.entrySet();
        for(Entry<String, Integer> entry:entries)
        {
            System.out.println(entry.getKey() +":"  +entry.getValue());
        }

        System.out.println("============================\n");

        map.putIfAbsent("Six",6);
        map.putIfAbsent("SEVEN",7);
        map.putIfAbsent("ONE",1);
        map.putIfAbsent("Eight",7);
        map.put("Eight",7);


        Set<Entry<String,Integer>> entries1=map.entrySet();
        for(Entry<String, Integer> entry:entries1)
        {
            System.out.println(entry.getKey() +":"  +entry.getValue());
        }


    }



}

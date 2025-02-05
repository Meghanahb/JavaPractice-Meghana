package MapAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import  java.util.Map.Entry;

public class Assign89And10
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"appa");
        map.put(2,"amma");
        map.put(3,"praju");
        map.put(4,"megha");
        System.out.println("HasMap Key Value Pair");

        //All KEys in HashMap
        Set<Integer> keys=map.keySet();
        for(Integer key:keys)
        {
            System.out.println("All Keys:" +key);
           //System.out.println(map.get(key));
        }



        //All Values
        Collection<String> values=map.values();
        for(String value:values)
        {
            System.out.println("All Values: " +value);
        }

        //KeySet
        Set<Entry<Integer,String>> entyset=map.entrySet();
        for(Entry<Integer,String> result:entyset)
        {
            System.out.println("Both Key and Value:" +result);
        }


    }
}

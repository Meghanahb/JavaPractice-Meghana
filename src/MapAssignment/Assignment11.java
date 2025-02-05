package MapAssignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Assignment11
{
    public static void main(String[] args)
    {
        HashMap map=new HashMap();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Entry<String,String>> entries=map.entrySet();
        for(Entry<String,String> entryset:entries)
        {
            //System.out.println("Total EntrySet:" +entryset);
            System.out.println(entryset.getKey() +":"  +entryset.getValue());


        }


        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println("All Keys:" +key);
        }
        keys.remove("ONE");


        System.out.println("After Removing");
        Set<Entry<String,String>> entries1=map.entrySet();
        for(Entry<String,String> entryset:entries1)
        {
            //System.out.println("Total EntrySet:" +entryset);
            System.out.println(entryset.getKey() +":"  +entryset.getValue());


        }


    }

}

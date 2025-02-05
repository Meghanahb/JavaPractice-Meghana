package MapAssignment;

import java.util.*;
import java.util.Map.Entry;

public class Assignment2
{
    public static void main(String[] args)
    {
        Map<String, Integer> mobj=new HashMap<>();
        mobj.put("FIVE",5);
        mobj.put("ONE",1);
        mobj.put("FOUR",4);
        mobj.put("TWO",2);
        mobj.put("THREE",3);
        //System.out.println(mobj);

        /*Set<String> keys =mobj.keySet();
        for(String key: keys)
        {
            System.out.println(key);
        }

        Collection<Integer> values=mobj.values();
        for(Integer value:values)
        {
            System.out.println(value);
        }*/

        Set<Entry<String, Integer>> entry=mobj.entrySet();
        System.out.println(entry);

        for( Entry<String, Integer> keyvalue:entry)
        {
            System.out.println(keyvalue.getKey()  +":"  +keyvalue.getValue());
        }




    }
}

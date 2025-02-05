package MapAssignment;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment4
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap();
        map.put("Megha", 1);
        map.put("suchi",2);
        map.put("sushma",3);
        map.put("shiri",4);

        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(map.get(key));

        }
        System.out.println("Particular Key-Value");
        Integer str=map.get("Megha");
        System.out.println(str);

    }
}

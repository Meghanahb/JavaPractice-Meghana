package MapAssignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment12
{
    public static void main(String[] args)
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("FIVE","EEE");
        map.put("FOUR","DDD");
        map.put("THREE","CCC");
        map.put("TWO", "BBB");
        map.put("ONE","AAA");

        Set<Entry<String,String>> entries=map.entrySet();
        for(Entry<String,String> entry:entries)
        {
            System.out.println(entry.getKey()  +":"  +entry.getValue());
        }
        map.remove("FIVE","EEE");
        map.remove("FOUR","444");

        System.out.println();

        System.out.println("After Removing Specific key mapped to the Value");
        Set<Entry<String,String>> entries1=map.entrySet();
        for(Entry<String,String> entry:entries1)
        {
            System.out.println(entry.getKey()  +":"  +entry.getValue());
        }

    }
}

package MapAssignment;
//Replace a value associated with a given key in the HashMap

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class Assignment13
{
    public static void main(String[] args)
    {
        HashMap map=new HashMap();
        map.put("FIVE","EEE");
        map.put("FOUR","444");
        map.put("THREE","333");
        map.put("TWO","222");
        map.put("ONE","111");
        Set<Entry<String,String>> entries=map.entrySet();
        for(Entry<String,String> entry:entries)
        {
            System.out.println("HashMap Entries:" +entry);
        }
        map.replace("FIVE","EEE","555");

        System.out.println();
        System.out.println("After Replacing the Value");
        for(Entry<String,String> entry:entries)
        {
            System.out.println("HashMap Entries:" +entry);
        }
    }
}

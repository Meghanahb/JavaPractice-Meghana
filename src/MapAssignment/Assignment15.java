package MapAssignment;
//*********************************Replacing value Only if the key is present ************************************
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment15
{
    public static void main(String[] args)
    {
        HashMap map=new HashMap();
        map.put("FIVE","555");
        map.put("FOUR","444");
        map.put("megha","YES");
        Set<Entry<String,String >> entries=map.entrySet();
        for(Entry<String,String> entry:entries)
        {
            System.out.println("HashMap Set Entries" +entry);
        }
        map.replace("megha","YES","First Value");
        map.replace("meghana","YES","Not Present");
        map.replace("megha","YES","Second Value");

        System.out.println();
        System.out.println("After Replacing value Only if the key is present ");
        System.out.println();
        for(Entry<String,String> entry:entries)
        {
            System.out.println("HashMap Set Entries" +entry);
        }
    }
}

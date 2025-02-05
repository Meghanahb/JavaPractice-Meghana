package CollectionConcept;

import java.util.*;

public class MapPractice
{
    public static void main(String[] args) {
        Map m = new Hashtable();
        m.put(1, "megha");
        m.put(2, "praju");
        m.put(3, "jaya");
        m.put(4, "basavanna");
        System.out.println(m);

        Map<Integer, String> m1 = new Hashtable<>();
        m1.put(3091, "suchi");
        m1.put(3092, "shiri");
        m1.put(3093, "sushma");
        m1.put(3094, "anusha");

        //Retreving KEy Elements from map -1 using Collection
        //Map<Integer,String> keys=m1.keySet();
        Collection<Integer> keys = m1.keySet();
        for (int key : keys) {
            System.out.println(key);
        }

        //Retrieving KEy Elements from map -2 using Set
        //Map<Integer,String> keys=m1.keySet();
        Set<Integer> keyss = m1.keySet();
        for (int key : keyss) {
            System.out.println(key);
        }

        //Retrieving Values from map
        Collection<String> ckeys = m1.values();
        for (String ckey : ckeys) {
            System.out.println(ckey);
        }

        //Verifying keys elements in map
        System.out.println(m1.containsKey(3091));
        System.out.println(m1.containsKey(3097));


        //Verifying Values from Map
        System.out.println(m1.containsValue("suchi"));
        System.out.println(m1.containsValue("suchitra"));


        //Updating Element to Map
        m1.putIfAbsent(3095, "Meghana");
        System.out.println(m1);
        //putIfAbsent---->it will add the element only if given Key is not present. in given below
        //ex: the Key 3095 is present with value meghana so it wont take one more 3095 with value praju
        m1.putIfAbsent(3095, "praju");
        System.out.println(m1);

        //GET
        System.out.println(m1.get(3095));

        //using get method we can print the values associated the Keys
        System.out.println("Output using get Method");
        for (Integer keyg : keyss)
        {
            System.out.println(m1.get(keyg));
        }

        //Replace
        m.replace(3,"JAYA");
        m.replace(4,"BASAVANNA");
        System.out.println(m);
        m.remove(1);
        System.out.println(m);
        m.clear();
        System.out.println(m);


    }
}

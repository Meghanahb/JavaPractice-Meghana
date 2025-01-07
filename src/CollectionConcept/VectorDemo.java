package CollectionConcept;

import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector vec=new Vector();
        vec.add("Meghana");
        vec.add("suchi");
        vec.add("praju");
        System.out.println("Vector List:"+vec);
        System.out.println(vec.capacity());
        System.out.println(vec.size());
        System.out.println(vec.contains("praju"));
        vec.set(0,"pavan");
        System.out.println("Vector List:"+vec);
        //vec.set(4,"2025");


        Vector vec1=new Vector();
        vec1.add("jaya");
        vec1.add("basavanna");
        System.out.println(vec1);
        vec1.addAll(vec);
        System.out.println("Vector List:"+vec1);
        vec1.get(1);
        System.out.println("Vector List:"+vec1);
        vec1.set(2,"Meghana");
        vec1.remove("suchi");
        System.out.println("Vector List:"+vec1);

        /*//Retriving element using for loop

        for(int i=0;i<vec1.size();i++)
        {
            System.out.println("Vector List:"+vec1.get(i));
        }*/

        //Using ForEach
        for(Object val:vec1)
        {
            System.out.println("Vector List:"+val);
        }

    }
}

package CollectionConcept;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class SetPractice
{
    public static void main(String[] args)

    {
        Set<Integer> sobj=new HashSet<>();
        //Adding element
        sobj.add(1);
        sobj.add(2);
        sobj.add(3);
        sobj.add(4);
        sobj.add(5);
        sobj.add(5);
        System.out.println(sobj);

        //Retrieving
        for(int value:sobj)
            System.out.println(value);

        //Remove
        sobj.remove(5);
        System.out.println(sobj);

        //verification
        System.out.println(sobj.contains(5));
        System.out.println(sobj.contains(4));

        //Converting Array List into Set
        List al=new ArrayList<>();
        al.add(71);
        al.add(72);
        al.add(73);
        al.add(74);
        al.add(75);
        System.out.println(al);
        Set<Integer> sl=new HashSet<>(al);
        System.out.println(sl);


        TreeSet<Integer> tobj=new TreeSet<>();
        //Adding element
        tobj.add(1);
        tobj.add(2);
        tobj.add(3);
        tobj.add(4);
        tobj.add(5);
        tobj.add(5);
        System.out.println(tobj);
        //tobj.add(null);//Treeset womt allow NULL
        System.out.println(tobj.first());
        System.out.println(tobj.last());
        System.out.println(tobj.pollFirst());
        System.out.println(tobj.pollFirst());
    }
}

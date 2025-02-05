import java.util.*;
public class NumberOfChar
{
    public static void main(String[] args)
    {
        /*Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=obj.next();*/

        String name = "MeganaBasavanna";
        int count=0;
        String expName = "";
        String duplicateval = "";
        for(int i = 0; i< name.length()-1; i++){
            if(!expName.contains(String.valueOf(name.charAt(i)))){
                expName = expName+ name.charAt(i);
            }
            else{
                duplicateval = duplicateval+name.charAt(i);

            }
        }
        //if(duplicateval)
        char[] array=duplicateval.toCharArray();
        System.out.println(array.length);
        System.out.println(expName);
        System.out.println(duplicateval);
        //System.out.println(count);
    }
}

import java.util.Scanner;

public class CountNoOfWords
{
    public static void main(String[] args)
    {
        String str="How are you meghana";
        /*Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=obj.next();*/
        //String[] line=str;

        String[] array=str.split(" ");
        int len=array.length;
        System.out.println("Number of Word in sentence:"+len);
    }
}

import java.util.*;
public class Palindrome
{
    public static  void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= obj.next();
        int len=str.length();
        String orgstr=str;
        String reversStr="";
        //char[] array=str.toCharArray();
        for(int i=len-1;i>=0;i--)
        {
            reversStr=reversStr+str.charAt(i);
        }
        //if(orgstr.equalsIgnoreCase(orgstr.equals(reversStr)))
         if(orgstr.equalsIgnoreCase(reversStr))
            System.out.println("The given String is Palindrome");
            else
                System.out.println("The given string is Not Palindrome");
    }
}

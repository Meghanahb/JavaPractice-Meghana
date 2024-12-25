public class ReverseString
{
    public static void main(String[] args)
    {
        String name="Meghana Basavanna";//6
        String rev="";
        int len=name.length();//7
        System.out.println(len);
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}

public class PrintStar3
{
    public static void main(String[] args)
    {
        int r=5;
        for(int i=0;i<r;i++)
        {
            for(int s=r-i;s>0;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

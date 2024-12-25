public class PyramidStar
{
    public static void main(String[] args)
    {
        int r=4;
        /*for(int i=1;i<=r;i++) {
            for (int s=r-i; s>=0; s--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for(int i=r;i>0;i--)
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


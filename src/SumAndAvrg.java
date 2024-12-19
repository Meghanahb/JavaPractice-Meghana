import java.util.*;
public class SumAndAvrg
{
    public static void main(String[] args)
    {
        System.out.println("Sum And Average of array");
        //int[] arr={2,-9,0,5,12,-10,20};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int len=arr.length;
        System.out.println("Enter the array Element");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<len;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of Element:"+sum);
        System.out.println("Average of Sum");
        float avr=sum/len;
        System.out.println("Average of Element:"+avr);
    }
}

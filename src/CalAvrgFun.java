public class CalAvrgFun
{
    public static void main(String[] args)
    {
        int[] array={10,20,30,40};
        double average=calculateAverage(array);
        System.out.println("The Average is:"+average);
    }
    public static double calculateAverage(int[] array)
    {
        double sum=0;
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            sum+=array[i];
        }
        return sum/len;
    }
}

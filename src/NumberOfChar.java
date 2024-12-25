public class NumberOfChar
{
    public static void main(String[] args)
    {
        String line="anna";
        //int len=line.length();
        System.out.println(line.length());
        int counts=0;
        char[] res=line.toCharArray();
        /*for(int a=0;a<res.length;a++)
        {
            System.out.print(res[a]);
        }*/

        for(int i=0;i<res.length-1;i++)
        {
            for (int j = 0; j <res.length-1; j++) {
                //int i;
                if (res[i] == res[j])
                    counts++;
            }
        }

        /*if(counts==1)
            System.out.println(res[j]);*/
    }
}
